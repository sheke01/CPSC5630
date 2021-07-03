package com.sheke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheke.model.Voters;

public interface VotersRepository extends JpaRepository<Voters, String> {

	public Voters findVotersByFirstName(String name);
	
}
