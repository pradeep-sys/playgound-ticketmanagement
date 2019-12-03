package com.altimetrik.playground.ticketManagement.service;

import java.util.List;

import com.altimetrik.playground.ticketManagement.model.TicketRequest;
import com.altimetrik.playground.ticketManagement.model.TicketRequestWrapper;
import com.altimetrik.playground.ticketManagement.model.TicketResponse;

public interface TicketService {

	
	List<TicketResponse> createOrUpdateTickets(List<TicketRequest> wrapper);
}
