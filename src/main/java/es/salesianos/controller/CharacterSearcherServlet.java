package es.salesianos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.FilmActors;
import es.salesianos.service.FilmActorService;

@Controller
public class CharacterSearcherServlet {

	@Autowired
	@Qualifier("filmActorService")
	private FilmActorService filmactorService;
	
	@GetMapping("characterSearcher")
	public String viewCharacterPage() {
		return "characterSearcher";
	}
	
	@PostMapping("characterSearcher")
	public ModelAndView findingCharacter(String role) {
		FilmActors selectfilmActor = filmactorService.filterAllPeliculaActor(role);
		ModelAndView model = new ModelAndView("characterSearcher");
		model.addObject("selectfilmActor", selectfilmActor);
		return model;
	}
}
