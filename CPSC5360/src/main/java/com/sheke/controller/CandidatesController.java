package com.sheke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sheke.model.Candidates;
import com.sheke.repo.CandidatesRepository;

@RestController
@RequestMapping("candidates")
@CrossOrigin("http://localhost:4200")
public class CandidatesController {
	
	CandidatesRepository candidatesRepository;
	
	@Autowired
	public CandidatesController(CandidatesRepository candidatesRepository) {
		this.candidatesRepository = candidatesRepository;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> save(@RequestBody Candidates candidate) {
		candidatesRepository.save(candidate);
		
		return ResponseEntity.ok(candidate.getFirstName()+" has been added successfully");
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Candidates> findAllCandidates(){
		return candidatesRepository.findAll();
	}

}
