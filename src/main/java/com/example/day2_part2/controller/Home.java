package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent() {

        ArrayList<StudentModel> student = new ArrayList<>();
        student.add(new StudentModel(1, "Mahesh", "mahesh@gmail.com"));
        student.add(new StudentModel(2, "Rahul", "rahul@gmail.com"));
        student.add(new StudentModel(3, "Amit", "amit@gmail.com"));
        student.add(new StudentModel(4, "Sneha", "sneha@gmail.com"));
        student.add(new StudentModel(5, "Priya", "priya@gmail.com"));
        return student;
    }

}