package com.altimetrik.playground.ticketManagement.dao;

import com.altimetrik.playground.ticketManagement.model.TicketDTO;
import com.altimetrik.playground.ticketManagement.model.TicketRequest;
import com.altimetrik.playground.ticketManagement.model.TicketResponse;
import com.altimetrik.playground.ticketManagement.model.TrelloRequest;

public interface TicketRepository {

	Boolean save(TicketRequest trelloRequest,TicketResponse ticketResponse );
	Boolean update(TicketRequest trelloRequest,TicketResponse ticketResponse );
	TicketDTO find(TicketRequest trelloRequest);
	
	
}
