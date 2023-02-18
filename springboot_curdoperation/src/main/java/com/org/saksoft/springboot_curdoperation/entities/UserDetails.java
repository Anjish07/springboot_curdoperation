package com.org.saksoft.https://github.com/Anjish07/springboot_curdoperation.git.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name= "Employee")
public class UserDetails {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "First Name")
	private String FirstName;
	
	@Column(name = "Last Name")
	private String LastName;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Age")
	private int Age;
	
	

	public UserDetails() {
		
	}

	public UserDetails(int id, String firstName, String lastName, String email, int age) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Age = age;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "UserDetails [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Age=" + Age + "]";
	}
	
	
	
	
	

}
