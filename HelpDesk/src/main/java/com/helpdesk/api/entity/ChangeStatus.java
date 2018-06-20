package com.helpdesk.api.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.helpdesk.api.enums.StatusEnum;

import java.util.Date;

import org.springframework.data.annotation.Id;

@Document
public class ChangeStatus {

	@Id
	private String Id;
	
	@DBRef(lazy=true)
	private Ticket ticket;
	
	@DBRef(lazy=true)
	private User user;
	
	private Date dateChangeStatus;
	
	private StatusEnum status;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateChangeStatus() {
		return dateChangeStatus;
	}

	public void setDateChangeStatus(Date dateChangeStatus) {
		this.dateChangeStatus = dateChangeStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	
}

