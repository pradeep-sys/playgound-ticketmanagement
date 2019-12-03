package com.altimetrik.playground.ticketManagement.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.altimetrik.playground.ticketManagement.dao.TicketRepository;
import com.altimetrik.playground.ticketManagement.model.TicketDTO;
import com.altimetrik.playground.ticketManagement.model.TicketRequest;
import com.altimetrik.playground.ticketManagement.model.TicketResponse;
import com.altimetrik.playground.ticketManagement.model.TrelloRequest;

@Repository
public class JDBCTicketRepository implements TicketRepository {

	 @Autowired
	 JdbcTemplate jdbcTemplate;
	
	@Override
	public Boolean save(TicketRequest ticketRequest,TicketResponse ticketResponse) {
		// TODO Auto-generated method stub
		
		StringBuffer query =  new StringBuffer();
		query.append("INSERT INTO tb_ticket(defect_id,version_id,ticket_id,created_date) values(?,?,?,CURRENT_TIMESTAMP())");
		int result = jdbcTemplate.update(query.toString(),ticketRequest.getId(),ticketRequest.getVersion(),ticketResponse.getId());
	
		if(result>0) {
			return true;
		} 
		
		return false;
	
	}

	@Override
	public Boolean update(TicketRequest ticketRequest,TicketResponse ticketResponse) {
		
		StringBuffer query =  new StringBuffer();
		query.append("UPDATE tb_ticket SET version_id=?,update_date=CURRENT_TIMESTAMP() WHERE defect_id=? ");
		int result = jdbcTemplate.update(query.toString(),ticketRequest.getVersion(),ticketRequest.getId());
	
		if(result>0) {
			return true;
		} 
		
		return false;
		
	}

	@Override
	public TicketDTO find(TicketRequest trelloRequest) {
		StringBuffer query =  new StringBuffer();
		query.append("SELECT  defect_id,version_id,ticket_id,created_date,update_date FROM tb_ticket WHERE defect_id=? ");
		TicketDTO ticketDTO =(TicketDTO) jdbcTemplate.queryForObject(query.toString(),new Object[]{trelloRequest.getId()}, new BeanPropertyRowMapper(TicketDTO.class));
	 
		return ticketDTO;
	}

}
