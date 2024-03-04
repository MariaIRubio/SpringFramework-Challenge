package com.exercise.SpringFrameworkChallenge.repo;

import com.exercise.SpringFrameworkChallenge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
}
