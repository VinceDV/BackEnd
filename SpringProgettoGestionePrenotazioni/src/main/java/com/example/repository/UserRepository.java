package com.example.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	Page<User> findByNome(String nome, Pageable pageable);
	
	Optional<User> findByUsername(String nome);


}
