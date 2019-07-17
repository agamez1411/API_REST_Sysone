package com.api_sysone.rest.service;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.api_sysone.rest.Automovil;

@Path("/Costofinal")
public class ServiceCostoFinal {
	


	@POST
	@Path("/precio")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Automovil precio(Automovil ao) {
		return ao;
		
		
	}

}
