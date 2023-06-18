package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Allarme;

public interface AllarmeRepo extends JpaRepository<Allarme, Long>{

}
