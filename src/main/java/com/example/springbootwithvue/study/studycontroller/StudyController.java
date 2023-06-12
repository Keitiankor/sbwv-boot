package com.example.springbootwithvue.study.studycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }
}
