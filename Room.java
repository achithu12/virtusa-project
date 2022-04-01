package com.examly.springapp.tables;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomID;
	private int roomNo;
	private String type;
	private String price;
	private String status;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "admin.admin_id")
	private Admin admin;


	public Room() {
		
	}
	public Room(int roomID, int roomNo, String type, String price, String status, Admin admin) {
		super();
		this.roomID = roomID;
		this.roomNo = roomNo;
		this.type = type;
		this.price = price;
		this.status = status;
		this.admin = admin;
	}


	public int getRoomID() {
		return roomID;
	}


	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}


	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	
	
}
