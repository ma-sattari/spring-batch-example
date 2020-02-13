package com.masoud.springbatchexample.repository;

import com.masoud.springbatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
