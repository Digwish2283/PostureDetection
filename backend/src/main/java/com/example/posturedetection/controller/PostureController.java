package com.example.posturedetection.controller;

import com.example.posturedetection.model.UserPosture;
import com.example.posturedetection.service.PostureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posture")
public class PostureController {
    @Autowired
    private PostureService service;

    @PostMapping("/upload")
    public UserPosture saveResult(@RequestBody UserPosture userPosture) {
        return service.saveResult(userPosture);
    }

    @GetMapping("/results")
    public List<UserPosture> getAllResults() {
        return service.getAllResults();
    }
}
