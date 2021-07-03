package com.sheke.controller;
import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheke.dto.VotingResultDTO;
import com.sheke.model.SecondSenateVote;
import com.sheke.repo.SecondSenateVoteRepository;

@RestController
@RequestMapping("secondsv")
@CrossOrigin("http://localhost:4200")
public class SecondSenateVoteController {
	
	SecondSenateVoteRepository secondSenateVoteRepository;
	
	SecondSenateVoteController(SecondSenateVoteRepository secondSenateVoteRepository){
		this.secondSenateVoteRepository = secondSenateVoteRepository;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> save(@RequestBody SecondSenateVote ssVote) throws SQLException {
		secondSenateVoteRepository.save(ssVote);
		
		return ResponseEntity.ok(ssVote.getVoterId() +" has been voted successfully");
	}
	
	@GetMapping(value="/result")
	public List<VotingResultDTO> getResult(){
		return secondSenateVoteRepository.getVoteResult();
	}

}
