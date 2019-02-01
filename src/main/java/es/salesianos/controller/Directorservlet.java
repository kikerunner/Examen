package es.salesianos.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Actor;
import es.salesianos.model.Director;
import es.salesianos.model.Film;
import es.salesianos.service.DirectorService;
import es.salesianos.service.Service;
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
	public String getListFilmPage() {
		return "addDirector";
	}
	
	@GetMapping("deleteDirector")
	public String deleteDirector(int codDirector) {
		directorService.searchAndDeleteDirector(codDirector);
		return "addDirector";
	}
	@PostMapping("LoadDirectorsList")
	public ModelAndView getListActors() {
		List<Director> directores = service.selectAllDirector();
		ModelAndView model = new ModelAndView("addDirector");
		model.addObject("listAllDirectors", directores);
		return model;
	}
	@PostMapping("AddDirector")
	public String CreateActor(Director director) {
		directorService.addDirector(director);
		return "addDirector";
	}
}
