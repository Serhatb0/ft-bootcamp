package com.biricik.ftBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biricik.ftBootcamp.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
