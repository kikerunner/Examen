package es.salesianos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Actor;
import es.salesianos.model.FilmActors;
import es.salesianos.service.ActorService;
import es.salesianos.service.FilmActorService;
@Controller
public class ActorSeacherServlet {

	
	@Autowired
	@Qualifier("filmActorService")
	private FilmActorService filmactorService;
	
	@Autowired
	@Qualifier("actorService")
	private ActorService actorService;
	
	@GetMapping("ActorSearcher")
	public String getActorSearcherPage() {
		return "ActorSearcher";
	}
	
	@PostMapping("ActorSearcher")
	public ModelAndView getListActors(@RequestParam String name) {
		Actor listFilterActor = actorService.filterAllDirector(name);
		ModelAndView model = new ModelAndView("ActorSearcher");
		model.addObject("listFilterActor", listFilterActor);
		return model;
	}
}