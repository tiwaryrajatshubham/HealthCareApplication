/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
* 
* @author  Tiwary Rajat Shubham
* @version 1.0
* @since   2014-03-31 
*/
package com.cg.healthcare.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "Users")
// Entity bean to store User object
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id

	private int id;
	private String username;
	private String password;
	private String role;

	public User() {

	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

}
