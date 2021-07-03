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

import com.sheke.model.Voters;
import com.sheke.repo.VotersRepository;

@RestController
@RequestMapping("voters")
@CrossOrigin("http://localhost:4200")
public class VotersController {
	
	VotersRepository votersRepository;
	
	@Autowired
	public VotersController(VotersRepository votersRepository) {
		this.votersRepository = votersRepository;
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> save(@RequestBody Voters input) {
		
		String hash = input.getFirstName()+input.getLastName()+input.getAddress();
		int voterId = hash.hashCode();
		
		Voters voter = new Voters(voterId, input.getSsn(), input.getFirstName(),
				input.getLastName(), input.getSex(), input.getDateOfBirth(),input.getAddress());
		
		System.out.println(voter);
		
		votersRepository.save(voter);
		return ResponseEntity.ok(voter.getFirstName()+" has been added successfully");
		
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Voters> findAllVoters(){
		return votersRepository.findAll();
	}

}
