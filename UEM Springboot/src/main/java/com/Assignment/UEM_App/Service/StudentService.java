package com.Assignment.UEM_App.Service;

import com.Assignment.UEM_App.Model.DepartmentType;
import com.Assignment.UEM_App.Model.Student;
import com.Assignment.UEM_App.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;

    // Add Student
    public String addStudent(Student student) {
        iStudentRepository.save(student);

        return "Student Added";
    }

    //Update Student Department By I'd
    public String updateStudentDepartment(Long studentId, DepartmentType departmentType) {
        Student existingStudent = iStudentRepository.findById(studentId).get();
        existingStudent.setDepartment(departmentType);
        iStudentRepository.save(existingStudent);
        return "Department Updated";
    }

    // Delete Student By Id
    public String deleteStudentById(Long studentId) {
        iStudentRepository.deleteById(studentId);
        return "Student Deleted";
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    // Get Students By I'd
    public Student getStudentById(Long studentId) {
        return iStudentRepository.findById(studentId).orElse(null);
    }
}
