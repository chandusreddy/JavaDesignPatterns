package com.chandu.design.patterns.businessdelegate.services;
// This is the Business delegate interface that contains the operations provided

//import com.chandu.design.patterns.businessdelegate.entites.FlightTicket;
import com.chandu.design.patterns.businessdelegate.bo.FlightTicket;

public interface FlightTicketService {

	void bookTicket(FlightTicket flightticket);
	
	
}
