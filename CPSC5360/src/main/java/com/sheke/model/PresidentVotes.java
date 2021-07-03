package com.sheke.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class PresidentVotes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -596245762722891995L;
	
	public PresidentVotes() {}
	
	public PresidentVotes(int voterId, String candidateName) {
		super();
		this.voterId = voterId;
		this.candidateName = candidateName;
	}

	public PresidentVotes(int id, int voterId, String candidateName, Date dateVoted) {
		super();
		this.id = id;
		this.voterId = voterId;
		this.candidateName = candidateName;
		this.dateVoted = dateVoted;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int voterId;
	private String candidateName;
	@CreationTimestamp
    private Date dateVoted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public Date getDateVoted() {
		return dateVoted;
	}
}
