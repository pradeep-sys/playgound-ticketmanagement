package com.altimetrik.playground.ticketManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.altimetrik.playground.ticketManagement.model.TicketRequest;

import com.altimetrik.playground.ticketManagement.model.TicketResponse;
import com.altimetrik.playground.ticketManagement.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketRestController {
	
@Autowired
private TicketService ticketService;
		@CrossOrigin(origins = "http://localhost:8082")
		@RequestMapping(value = "/migrate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE ,method = RequestMethod.POST )
		public  List<TicketResponse> createOrUpdateTickets(@RequestBody List<TicketRequest> wrapper) {
			
			List<TicketResponse> result =	ticketService.createOrUpdateTickets(wrapper);
		 
			
			return result;
		}
		
		
		@RequestMapping("/")
	    public String index() {
	        return "Spring Boot Example";
	    }
		
}
