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
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Film;
import es.salesianos.model.assembler.ExamAssembler;
import es.salesianos.service.FilmService;

/**
 * Servlet implementation class PeliculaActorServlet
 */
@Controller
public class FilmActorServlet {
	
	@Autowired
	@Qualifier("filmService")
	private FilmService service;

	@GetMapping("FilmActor")
	public ModelAndView getFilmActorPage() {
		List<Film> films = service.listAllFilms();
		ModelAndView model = new ModelAndView("FilmActor");
		model.addObject("listAllFilms", films);
		return model;
	}
}
