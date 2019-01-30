package es.salesianos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.salesianos.service.ActorService;

@Controller
public class DeleteActorServlet{
	@Autowired
	@Qualifier("actorServicio")
	private ActorService service;
	
	@GetMapping("deleteActor")
	protected String borrarActor(@RequestParam int codActor){
		service.searchAndDeleteActor(codActor);
		return "addActor";
	}
	
	@PostMapping("deleteActor")
	protected String deleteActor(@RequestParam int codActor){
		service.searchAndDeleteActor(codActor);
		return "addActor";
	}
}
