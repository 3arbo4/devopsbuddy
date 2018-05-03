package com.devopsbuddy.backend.persistence.domain.backend;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.devopsbuddy.enums.PlansEnum;

@Entity
public class Plan implements Serializable{
	
	private static final long serilVersionUID = 1L;
	
	@Id
	private int id; //primary key (required notation)
	private String name;

	
	//must have a default constructor.  no default can cause an error for entities
	//since there is now default constructor in the JVM	
	public Plan(){
		
	}
	public Plan(PlansEnum plansEnum) {
		this.id = plansEnum.getId() ;
		this.name = plansEnum.getPlanName();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}