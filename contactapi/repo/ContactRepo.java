package com.contactApi.contactapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.contactApi.contactapi.domain.contact;

@Service
public interface ContactRepo extends JpaRepository<contact, String>{
	
	Optional<contact> findById(String id);

}
