package com.example.posturedetection.repository;

import com.example.posturedetection.model.UserPosture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPostureRepository extends JpaRepository<UserPosture, Long> {}
