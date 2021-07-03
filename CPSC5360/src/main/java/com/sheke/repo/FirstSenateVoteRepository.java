package com.sheke.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sheke.dto.VotingResultDTO;
import com.sheke.model.FirstSenateVote;

public interface FirstSenateVoteRepository extends JpaRepository<FirstSenateVote, Integer> {

	@Query(value="Select new com.sheke.dto.VotingResultDTO(pv.candidateName, COUNT(pv.candidateName))" + 
	"FROM FirstSenateVote AS pv GROUP BY 1 ORDER BY 1 DESC")
	List<VotingResultDTO> getVoteResult();
}
