package com.Assignment.UEM_App.Control;

import com.Assignment.UEM_App.Model.DepartmentType;
import com.Assignment.UEM_App.Model.Student;
import com.Assignment.UEM_App.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody @Valid Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("student/{studentId}/{departmentType}")
    public String updateStudentDepartment(@PathVariable Long studentId, @PathVariable DepartmentType departmentType){
        return studentService.updateStudentDepartment(studentId,departmentType);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudentById(studentId);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }
}
