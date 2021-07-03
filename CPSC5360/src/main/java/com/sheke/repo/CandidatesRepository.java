package com.sheke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheke.model.Candidates;

public interface CandidatesRepository extends JpaRepository<Candidates, Integer> {
	
	public Candidates findCandidatesByCandidateId(int id);
}
