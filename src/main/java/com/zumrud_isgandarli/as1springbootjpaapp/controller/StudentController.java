package com.zumrud_isgandarli.as1springbootjpaapp.controller;

import com.zumrud_isgandarli.as1springbootjpaapp.model.Student;
import com.zumrud_isgandarli.as1springbootjpaapp.service.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/students"})
public class StudentController {
    @Autowired
    private StudentRepository repo;

    public StudentController() {
    }

    @GetMapping
    public String showStudentList(Model model) {
        List<Student> students = this.repo.findAll(Sort.by(Direction.DESC, new String[]{"id"}));
        model.addAttribute("students", students);
        return "students/index";
    }
}