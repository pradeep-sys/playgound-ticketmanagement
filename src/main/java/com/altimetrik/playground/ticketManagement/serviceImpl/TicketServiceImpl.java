package com.altimetrik.playground.ticketManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.altimetrik.playground.ticketManagement.dao.TicketRepository;
import com.altimetrik.playground.ticketManagement.model.TicketDTO;
import com.altimetrik.playground.ticketManagement.model.TicketRequest;
import com.altimetrik.playground.ticketManagement.model.TicketResponse;
import com.altimetrik.playground.ticketManagement.model.TrelloRequest;
import com.altimetrik.playground.ticketManagement.model.TrelloResponse;
import com.altimetrik.playground.ticketManagement.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Value("${trello.board.id}")
	private String trelloBoardId;

	@Value("${trello.list.id}")
	private String trelloListId;

	@Value("${trello.url.createcard}")
	private String createUrl;

	@Value("${trello.url.updatecard}")
	private String updateUrl;
	
	@Value("${trello.api.key}")
	private String key;
	
	@Value("${trello.api.token}")
	private String token;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	TrelloRequest trelloRequest;
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<TicketResponse> createOrUpdateTickets(List<TicketRequest> wrapper) {

		List<TicketResponse> listTicketResponse = new ArrayList<>();
		TicketDTO ticketDTO  = null;

		for (TicketRequest ticketRequest : wrapper) {
			TicketResponse ticketResponse = new TicketResponse();
			trelloRequest.setName(ticketRequest.getTitle());
			trelloRequest.setIdList(trelloListId);
			trelloRequest.setDesc(ticketRequest.getDescription());
			try {			 
				ticketDTO = ticketRepository.find(ticketRequest);
			}catch (EmptyResultDataAccessException e) {
				 
			}
			ResponseEntity<String> updateResponse = null;
			
			if(null == ticketDTO) {
				TrelloResponse trelloResponse = restTemplate.postForObject(createUrl, trelloRequest,
						TrelloResponse.class);
				if (null != trelloResponse) { 
					ticketResponse.setStatus("Success");
					ticketResponse.setType("created");
					ticketResponse.setId(trelloResponse.getId());
					listTicketResponse.add(ticketResponse); 
					Boolean status=	ticketRepository.save(ticketRequest, ticketResponse);
					System.out.println("created status"+status);
				}
			}
			
			else if (null != ticketDTO && ticketDTO.getVersionId() != ticketRequest.getVersion()) {
				HttpHeaders headers = new HttpHeaders();
				String url=this.updateUrl;
				url +=ticketDTO.getTicketId()+"?key="+this.key+"&token="+this.token;
				trelloRequest.setId(ticketDTO.getTicketId());
				headers.setContentType(MediaType.APPLICATION_JSON);

				// set my entity
				HttpEntity<TrelloRequest> entity = new HttpEntity<TrelloRequest>(trelloRequest, headers);

				updateResponse = restTemplate.exchange(url, HttpMethod.PUT, entity, String.class);

			}  
			if (null != updateResponse && updateResponse.getStatusCodeValue() == 200) {
				ticketResponse.setStatus("Success");
				ticketResponse.setType("Updated");
				ticketResponse.setId(ticketDTO.getTicketId());
				listTicketResponse.add(ticketResponse);
				Boolean status=	ticketRepository.update(ticketRequest, ticketResponse);
				System.out.println("updated status"+status);
			}
			 
		}

		return listTicketResponse;

	}

}
