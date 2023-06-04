package com.example.restservice;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/task")
    public String taskWatch(@ModelAttribute TaskModel task, Model model) {
        System.out.println(task.toString());
        System.out.println(task.getCase1());
        System.out.println(task.getCase2());
        System.out.println(task.getCase3());
        model.addAttribute("name",task.getPname());
        model.addAttribute("case1",task.getCase1());
        model.addAttribute("case2",task.getCase2());
        model.addAttribute("case3",task.getCase3());
        return "task";
    }
}
