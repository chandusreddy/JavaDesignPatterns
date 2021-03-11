package com.chandu.design.patterns.businessdelegate.bo;

// This is a Business Object class that is similar to the Entity class that was under the package
// com.chandu.design.patterns.businessdelegate.entities but if there are changes to the entity names we need to
// update all the references but with This Business Object its easy to change the names as required.
public class FlightTicket {

	private int id;
	private String airlines;
	private String arrivalcity;
	private String departurecity;

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

	public String getArrivalcity() {
		return arrivalcity;
	}

	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}

}
