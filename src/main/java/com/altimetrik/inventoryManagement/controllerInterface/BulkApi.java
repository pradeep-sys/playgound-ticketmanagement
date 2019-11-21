
package com.altimetrik.inventoryManagement.controllerInterface;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.altimetrik.inventoryManagement.model.Battery;
import com.altimetrik.inventoryManagement.model.Path;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

@Api(value = "bulk", description = "the bulk API")
public interface BulkApi {

    @ApiOperation(value = "insert bulk item ", nickname = "createBulkItem", notes = "insert bulk item in the system", response = Battery.class, responseContainer = "List", authorizations = {
        @Authorization(value = "inventoryManagement_auth", scopes = {
            @AuthorizationScope(scope = "write:inventorys", description = "modify inventorys in your account"),
            @AuthorizationScope(scope = "read:inventorys", description = "read your inventorys")
            })
    }, tags={ "bulk", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Battery.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "inventory not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/bulk",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<List<Battery>> createBulkItem(@ApiParam(value = "bulk item" ,required=true )  @Valid @RequestBody Path body);

}
