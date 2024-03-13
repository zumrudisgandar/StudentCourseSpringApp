package com.zumrud_isgandarli.as1springbootjpaapp.service;

import com.zumrud_isgandarli.as1springbootjpaapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
