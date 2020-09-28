package com.eval.coronakit.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


class AssignedRoleId implements Serializable {

    private String userName;
    private String role;

    public AssignedRoleId() {}

    public AssignedRoleId(String userName, String role) {
        this.userName = userName;
        this.role= role;
    }

    
}


@Entity
@Table(name = "authorities",uniqueConstraints = @UniqueConstraint(columnNames = {"username", "authority"}))
@IdClass(AssignedRoleId.class)
public class Roles implements Serializable{
	

	@Id
	@Column(name = "username")
	private String userName;
	
	@Id
	@Column(name = "authority")
	private String role;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}