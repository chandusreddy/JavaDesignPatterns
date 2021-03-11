package com.chandu.design.patterns.businessdelegate.entites;

// This is a simple entity class with attributes mapping with the DB
public class FlightTicket {

	private int id;
	private String airlines;
	private String arrival;
	private String departure;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}
}
