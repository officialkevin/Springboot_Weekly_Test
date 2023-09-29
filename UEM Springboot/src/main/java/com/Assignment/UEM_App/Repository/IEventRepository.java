package com.Assignment.UEM_App.Repository;

import com.Assignment.UEM_App.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepository extends CrudRepository<Event, Long> {
    List<Event> findByEventDate(LocalDate date);
}
