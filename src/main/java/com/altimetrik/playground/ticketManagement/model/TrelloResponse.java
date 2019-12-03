package com.altimetrik.playground.ticketManagement.model;

import java.util.ArrayList;

public class TrelloResponse  {
	 private String id;
	 ArrayList < Object > attachments ;
	 ArrayList < Object > checkItemStates;
	 private boolean closed;
	 private boolean dueComplete;
	 private String dateLastActivity;
	 private String desc;
	 private String due = null;
	 private String dueReminder = null;
	 private String email = null;
	 private String idBoard;
	 ArrayList < Object > idChecklists ;
	 ArrayList < Object > stickers  ;
	 private String idList;
	 ArrayList < Object > idMembers = new ArrayList < Object > ();
	 ArrayList < Object > idMembersVoted = new ArrayList < Object > ();
	 private float idShort;
	 private String idAttachmentCover = null;
	 ArrayList < Object > labels = new ArrayList < Object > ();
	 ArrayList < Object > idLabels = new ArrayList < Object > ();
	 private boolean manualCoverAttachment;
	 private String name;


	 // Getter Methods 

	 public String getId() {
	  return id;
	 }

	 public boolean getClosed() {
	  return closed;
	 }

	 public boolean getDueComplete() {
	  return dueComplete;
	 }

	 public String getDateLastActivity() {
	  return dateLastActivity;
	 }

	 public String getDesc() {
	  return desc;
	 }

	 public String getDue() {
	  return due;
	 }

	 public String getDueReminder() {
	  return dueReminder;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public String getIdBoard() {
	  return idBoard;
	 }

	 public String getIdList() {
	  return idList;
	 }

	 public float getIdShort() {
	  return idShort;
	 }

	 public String getIdAttachmentCover() {
	  return idAttachmentCover;
	 }

	 public boolean getManualCoverAttachment() {
	  return manualCoverAttachment;
	 }

	 public String getName() {
	  return name;
	 }

	 // Setter Methods 

	 public void setId(String id) {
	  this.id = id;
	 }

	 public void setClosed(boolean closed) {
	  this.closed = closed;
	 }

	 public void setDueComplete(boolean dueComplete) {
	  this.dueComplete = dueComplete;
	 }

	 public void setDateLastActivity(String dateLastActivity) {
	  this.dateLastActivity = dateLastActivity;
	 }

	 public void setDesc(String desc) {
	  this.desc = desc;
	 }

	 public void setDue(String due) {
	  this.due = due;
	 }

	 public void setDueReminder(String dueReminder) {
	  this.dueReminder = dueReminder;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public void setIdBoard(String idBoard) {
	  this.idBoard = idBoard;
	 }

	 public void setIdList(String idList) {
	  this.idList = idList;
	 }

	 public void setIdShort(float idShort) {
	  this.idShort = idShort;
	 }

	 public void setIdAttachmentCover(String idAttachmentCover) {
	  this.idAttachmentCover = idAttachmentCover;
	 }

	 public void setManualCoverAttachment(boolean manualCoverAttachment) {
	  this.manualCoverAttachment = manualCoverAttachment;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }
	}
