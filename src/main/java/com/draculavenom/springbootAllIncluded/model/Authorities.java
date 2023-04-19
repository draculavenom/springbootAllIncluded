package com.draculavenom.springbootAllIncluded.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Authorities {
	@Id @GeneratedValue
	private Long id;
	private String username;
	private String authority;
	public Authorities(String username, String authority) {
		this.username = username;
		this.authority = authority;
	}
	public Authorities() {}
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
