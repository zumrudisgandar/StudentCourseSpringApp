package com.zumrud_isgandarli.as1springbootjpaapp.service;

import com.zumrud_isgandarli.as1springbootjpaapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}