package com.sheke.controller;

import java.sql.SQLException;
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
import com.sheke.model.FirstSenateVote;
import com.sheke.repo.FirstSenateVoteRepository;

@RestController
@RequestMapping("firstsv")
@CrossOrigin("http://localhost:4200")
public class FirstSenateVoteController {
	
	FirstSenateVoteRepository firstSenateVoteRepository;
	
	@Autowired
	FirstSenateVoteController(FirstSenateVoteRepository firstSenateVoteRepository){
		this.firstSenateVoteRepository = firstSenateVoteRepository;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> save(@RequestBody FirstSenateVote fsVote) throws SQLException{
		firstSenateVoteRepository.save(fsVote);
		
		return ResponseEntity.ok(fsVote.getVoterId() +" has been voted successfully");
	}
	
	@GetMapping(value="/result")
	public List<VotingResultDTO> getResult(){
		return firstSenateVoteRepository.getVoteResult();
	}

}
