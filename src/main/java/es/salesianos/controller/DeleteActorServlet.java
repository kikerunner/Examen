package es.salesianos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.salesianos.service.ActorService;
import es.salesianos.service.ActorServiceInterface;

@Controller
public class DeleteActorServlet{
	@Autowired
	@Qualifier("actorService")
	private ActorServiceInterface service;
	
	@GetMapping("deleteActor")
	protected String searchingAndDeletingActor(@RequestParam int codActor){
		service.searchAndDeleteActor(codActor);
		return "addActor";
	}
}
