package com.springboot.buildingblocks.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "user_firstname", unique = false)
	@Size(min=2)
	private String name;
	
	@Column(name = "user_ssn" , unique = true)
	private String ssn;
	
	@Column(name="user_name" , unique = true)
	private String userName;

	public User() {
		super();
	}

	public User(Long id, @Size(min = 2) String name, String ssn, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	
}
