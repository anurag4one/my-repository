package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "listAll", query = "SELECT b FROM BusDetails b")
public class BusDetails {
	
	@Id
	private int busId;
	@Column(length = 30)
	private String busTravelName;
	@Column(length = 30)
	private String source;
	@Column(length = 30)
	private String destination;
	private int availableSeats;
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusTravelName() {
		return busTravelName;
	}
	public void setBusTravelName(String busTravelName) {
		this.busTravelName = busTravelName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
}
