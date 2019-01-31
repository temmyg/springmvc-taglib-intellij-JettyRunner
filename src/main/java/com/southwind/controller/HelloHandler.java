package com.southwind.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.Student;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value="/get")
    public String get(Model model) {
        Student student = new Student(1,"张三",22,"男");
        model.addAttribute("student", student);
        return "index";
    }
    
    @GetMapping(value = "/login")
    public String login(Model model){
         model.addAttribute(new Student());
         return "login";
    }

    @PostMapping(value="/login")
    public String register(@Validated Student student,BindingResult br, Model model) {
        if (br.hasErrors()) {
            return "login";
        }
            model.addAttribute("student", student);
        int howmany = 13;
        System.out.println(student.getSelectedHobbies().length);
        model.addAttribute("howmany", howmany);
        return "added";
    }

}