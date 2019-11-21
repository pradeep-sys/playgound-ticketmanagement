package com.altimetrik.inventoryManagement.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.altimetrik.inventoryManagement.controllerInterface.BulkSearchApi;
import com.altimetrik.inventoryManagement.model.ItemInventoryDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;

@Controller
public class BulkSearchApiController implements BulkSearchApi {

    private static final Logger log = LoggerFactory.getLogger(BulkSearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public BulkSearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ItemInventoryDetails>> getItemDetails(@ApiParam(value = "get bulk item details"  )  @Valid @RequestBody List<ItemInventoryDetails> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<ItemInventoryDetails>>(objectMapper.readValue("<itemInventoryDetails>  <vendorId>123</vendorId>  <batteryId>123</batteryId>  <batteryModel>aeiou</batteryModel>  <avaliableCount>123</avaliableCount>  <souldCount>123</souldCount></itemInventoryDetails>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<ItemInventoryDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ItemInventoryDetails>>(objectMapper.readValue("[ {  \"souldCount\" : 5,  \"avaliableCount\" : 1,  \"batteryId\" : 6,  \"batteryModel\" : \"batteryModel\",  \"vendorId\" : 0}, {  \"souldCount\" : 5,  \"avaliableCount\" : 1,  \"batteryId\" : 6,  \"batteryModel\" : \"batteryModel\",  \"vendorId\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ItemInventoryDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ItemInventoryDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
