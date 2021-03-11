package com.chandu.design.patterns.businessdelegate.comtrollers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.chandu.design.patterns.businessdelegate.dao.FlightTicketDAO;
//import com.chandu.design.patterns.businessdelegate.entites.FlightTicket;
import com.chandu.design.patterns.businessdelegate.bo.FlightTicket;
import com.chandu.design.patterns.businessdelegate.services.FlightTicketService;

@Controller
public class FlightTicketController {

//	@Autowired
//	private FlightTicketDAO dao;
	
	// Using the Business logic from Service
	@Autowired
	private FlightTicketService service;

	@RequestMapping("/showcreateTicket")
	public String showcreateTicket() {
		return "createTicket";
	}
	@RequestMapping("/createTicket")
	public String createTicket(FlightTicket flightticket, ModelMap modelMap) {
		// we are using the Business delegate Service method implementation instead of using the dao direclty separating the business logic
		service.bookTicket(flightticket);
		//dao.create(flightticket);
		modelMap.addAttribute("msg","Ticket Booked Successfully");
		return "createTicket";
	}

}
