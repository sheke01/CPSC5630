package com.sheke.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Voters implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -183929497685369328L;

	public Voters() {
	}
	
	public Voters(int ssn, String firstName, String lastName, String sex, Date dateOfBirth,
			String address) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		LastName = lastName;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		Address = address;
	}
	
	public Voters(int voterId, int ssn, String firstName, String lastName, String sex, Date dateOfBirth,
			String address) {
		super();
		this.voterId = voterId;
		this.ssn = ssn;
		this.firstName = firstName;
		LastName = lastName;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		Address = address;
	}
	
	@Id
	private int voterId;
	private int ssn;
	private String firstName;
	private String LastName;
	private String sex;
	
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	private String Address;
	
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
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
	
	@Override
	public String toString() {
		return "Voters [voterId=" + voterId + ", ssn=" + ssn + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", sex=" + sex + ", dateOfBirth=" + dateOfBirth + ", Address=" + Address + "]";
	}

}
