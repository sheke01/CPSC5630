package com.sheke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sheke.dto.VotingResultDTO;
import com.sheke.model.PresidentVotes;
import com.sheke.repo.PresidentVotesRepository;

@RestController
@RequestMapping("president")
@CrossOrigin("http://localhost:4200")
public class PresidentVoteController {
	
	PresidentVotesRepository presidentVotesRepository;
	
	@Autowired
	PresidentVoteController(PresidentVotesRepository presidentVotesRepository){
		this.presidentVotesRepository = presidentVotesRepository;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> save(@RequestBody PresidentVotes request) {
		
		System.out.println(request.getVoterId());
		System.out.println(request.getCandidateName());
		
		presidentVotesRepository.save(request);
		
		return ResponseEntity.ok(request.getVoterId() +" has voted successfully");
	}
	
	@GetMapping(value="/result")
	public List<VotingResultDTO> getResult(){
		return presidentVotesRepository.getVoteResult();
	}
	
}
