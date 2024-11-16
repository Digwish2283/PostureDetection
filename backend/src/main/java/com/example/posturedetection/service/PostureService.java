package com.example.posturedetection.service;

import com.example.posturedetection.model.UserPosture;
import com.example.posturedetection.repository.UserPostureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostureService {
    @Autowired
    private UserPostureRepository repository;

    public UserPosture saveResult(UserPosture userPosture) {
        return repository.save(userPosture);
    }

    public List<UserPosture> getAllResults() {
        return repository.findAll();
    }
}
