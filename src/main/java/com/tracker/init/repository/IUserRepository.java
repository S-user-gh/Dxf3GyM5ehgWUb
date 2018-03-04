package com.tracker.init.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.init.model.User;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
