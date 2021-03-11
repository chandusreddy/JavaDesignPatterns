package com.chandu.design.patterns.businessdelegate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chandu.design.patterns.businessdelegate.entites.FlightTicket;

@Repository
public class FlightTicketDAOImpl implements FlightTicketDAO {

	private static final String sql = "insert into flightticket (airlines,arrival,departure) values(?,?,?)";

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public void create(FlightTicket flightticket) {
		jdbctemplate.update(sql, flightticket.getAirlines(), flightticket.getArrival(), flightticket.getDeparture());

	}

}
