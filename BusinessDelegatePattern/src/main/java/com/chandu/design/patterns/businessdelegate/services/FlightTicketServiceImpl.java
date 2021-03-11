package com.chandu.design.patterns.businessdelegate.services;
// This is the Business delegate interface implementation that contains the business logic 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.design.patterns.businessdelegate.bo.FlightTicket;
import com.chandu.design.patterns.businessdelegate.dao.FlightTicketDAO;

@Service
public class FlightTicketServiceImpl implements FlightTicketService {

	@Autowired
	FlightTicketDAO dao;

	@Override
	public void bookTicket(FlightTicket flightticket) {
		com.chandu.design.patterns.businessdelegate.entites.FlightTicket ticketEntity = new com.chandu.design.patterns.businessdelegate.entites.FlightTicket();
		// Business logic goes here
		ticketEntity.setId(flightticket.getId());
		ticketEntity.setAirlines(flightticket.getAirlines());
		ticketEntity.setArrival(flightticket.getArrivalcity());
		ticketEntity.setDeparture(flightticket.getDeparturecity());
		dao.create(ticketEntity);
		// Sending the booking confirmation logic etc.

	}

}
