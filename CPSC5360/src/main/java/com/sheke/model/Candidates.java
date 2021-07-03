package com.sheke.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Candidates implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8723585289516863793L;

	private Candidates() {
	}
	private Candidates(int candidateId, int ssn, String firstName, String lastName, String sex, Date dateOfBirth,
			String address, String position, String party) {
		super();
		this.candidateId = candidateId;
		this.ssn = ssn;
		this.firstName = firstName;
		LastName = lastName;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		Address = address;
		this.position = position;
		this.party = party;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int candidateId;
	private int ssn;
	private String firstName;
	private String LastName;
	private String sex;
	///@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date dateOfBirth;
	private String Address;
	private String position;
	private String party;
	
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "Candidates [candidateId=" + candidateId + ", ssn=" + ssn + ", firstName=" + firstName + ", LastName="
				+ LastName + ", sex=" + sex + ", dateOfBirth=" + dateOfBirth + ", Address=" + Address + ", position="
				+ position + ", party=" + party + "]";
	}
	
}
