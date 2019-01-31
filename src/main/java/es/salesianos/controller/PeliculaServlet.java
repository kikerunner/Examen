package es.salesianos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Film;
import es.salesianos.service.Service;

@Controller
public class PeliculaServlet {

	@Autowired
	@Qualifier("elServicio")
	private Service service;
	
	@GetMapping("addPelicula")
	public String getListFilmPage() {
		return "addPelicula";
	}
	
	@PostMapping("LoadFilmsList")
	public ModelAndView getListActors() {
		List<Film> films = service.selectAllPelicula();
		ModelAndView model = new ModelAndView("addPelicula");
		model.addObject("listAllFilms", films);
		return model;
	}
}
