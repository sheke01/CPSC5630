package com.sheke.dto;

public class VotingResultDTO {
	
	private String name;
	private long counts;
	
	public VotingResultDTO(String name, long counts) {
		super();
		this.name = name;
		this.counts = counts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCounts() {
		return counts;
	}

	public void setCounts(long counts) {
		this.counts = counts;
	}

}
