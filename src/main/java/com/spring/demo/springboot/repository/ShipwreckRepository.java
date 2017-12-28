package com.spring.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.springboot.model.Shipwreck;

@Repository
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
	
}
