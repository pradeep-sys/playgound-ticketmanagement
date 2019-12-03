package com.altimetrik.playground.ticketManagement.model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TrelloRequest {

 
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String desc; 
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	private String idList; 
}
