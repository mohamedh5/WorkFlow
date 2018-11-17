package com.kitvision.workflow.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
/**
 * 
 * @author mohamed
 *
 *	Basic user class.
 */
@Entity
public class User {

	/**
	 * For db id;
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	/**
	 * The user name must be unique.
	 */
	@Column(nullable=false,unique=true)
	private String username;
	/**
	 * user password.
	 */
	@Column(nullable=false)
	private String password;
	/**
	 * This filed will hold the password again to match it against the Password field.
	 * Will not be persisted. 
	 */
	@Transient
	private String passwordRetry;
	/**
	 * if the user active or disabled.
	 * User must be active to login to the system;
	 */
	private boolean active = true;
	/**
	 * if the password expired or not.
	 * Note will use if the user forgot the password.
	 */
	private boolean expired;
	/**
	 * all the roles that the user has.
	 */
	@OneToMany(fetch=FetchType.LAZY,orphanRemoval=true,cascade=CascadeType.MERGE)
	private Set<Role> roles;

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

	public String getPasswordRetry() {
		return passwordRetry;
	}

	public void setPasswordRetry(String passwordRetry) {
		this.passwordRetry = passwordRetry;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
