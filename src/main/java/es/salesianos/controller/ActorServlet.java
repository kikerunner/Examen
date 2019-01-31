package es.salesianos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Actor;
import es.salesianos.service.ActorService;
import es.salesianos.service.Service;

@Controller
public class ActorServlet {
	@Autowired
	@Qualifier("elServicio")
	private Service service;
	
	@Autowired
	@Qualifier("actorService")
	private ActorService actorService;

	@GetMapping("addActor")
	public String getListActorPage() {
		return "addActor";
	}
	
	@PostMapping("LoadActorsList")
	public ModelAndView getListActors() {
		List<Actor> actores = service.selectAllActor();
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("LoadActorsList", actores);
		return model;
	}
	
	@PostMapping("AddActor")
	public ModelAndView addingActor(Actor actor) {
		List<Actor> listAllActors = new ArrayList<>();
		actorService.addActor(actor);
		listAllActors = service.selectAllActor();
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("LoadActorsList", listAllActors);
		return model;
	}
	
	@PostMapping("FilterActor")
	public ModelAndView filteringActor(@RequestParam Integer beginDate, Integer endDate) {
		List<Actor> listAllActors = new ArrayList<>();
		listAllActors = actorService.filterAllActor(beginDate, endDate);
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("LoadActorsList", listAllActors);
		return model;
	}
}
