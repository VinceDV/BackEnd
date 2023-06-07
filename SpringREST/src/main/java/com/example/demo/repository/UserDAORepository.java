package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

@Repository
public interface UserDAORepository extends JpaRepository<User, Long>{
	
	public boolean existsById(Long id);
	public boolean existsByEmail(String email);

}
