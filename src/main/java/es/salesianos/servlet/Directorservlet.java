package es.salesianos.servlet;

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
import es.salesianos.model.Director;
import es.salesianos.service.DirectorService;
import es.salesianos.service.Service;

@Controller
public class Directorservlet {

	@Autowired
	@Qualifier("elServicio")
	private Service service;
	
	@Autowired
	@Qualifier("directorService")
	private DirectorService directorService;

	@GetMapping("addDirector")
	public String getListActorPage() {
		return "addDirector";
	}
	
	@PostMapping("LoadDirectorsList")
	public ModelAndView getListDirectors() {
		List<Director> directors = service.selectAllDirector();
		ModelAndView model = new ModelAndView("addDirector");
		model.addObject("listAllDirectors", directors);
		return model;
	}
	@PostMapping("AddDirector")
	public ModelAndView addingDirector(Director director) {
		List<Director> listAllDirectors = new ArrayList<>();
		service.insert(director);
		listAllDirectors = service.selectAllDirector();
		ModelAndView model = new ModelAndView("addDirector");
		model.addObject("listAllDirectors", listAllDirectors);
		return model;
	}
	@GetMapping("deleteDirector")
	protected String searchingAndDeletingDirector(@RequestParam int codDirector){
		directorService.searchAndDeleteDirector(codDirector);;
		return "addDirector";
	}
}
