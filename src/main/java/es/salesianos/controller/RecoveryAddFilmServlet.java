package es.salesianos.controller;

import java.io.IOException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Actor;
import es.salesianos.model.Film;
import es.salesianos.model.FilmActors;
import es.salesianos.model.assembler.ExamAssembler;
import es.salesianos.service.ActorService;
import es.salesianos.service.FilmService;
import es.salesianos.service.FilmActorService;
@Controller
public class RecoveryAddFilmServlet {
	@Autowired
	@Qualifier("filmService")
	private FilmService service;

	@Autowired
	@Qualifier("actorService")
	private ActorService actorService;
	
	@Autowired
	@Qualifier("filmActorService")
	private FilmActorService filmactorService;
	
	@GetMapping("recoveryFilm")
	protected ModelAndView asociateFilmActor(int cod){
		List<Actor> actores = actorService.listAllActors();
		ModelAndView model = new ModelAndView("selectActor");
		model.addObject("listAllActores", actores);
		model.addObject("codFilm", cod);
		return model;
	}
	@GetMapping("selectPeliculaActor")
	protected ModelAndView selectingActor(@RequestParam int codActor, int codFilm) {
		ModelAndView model = new ModelAndView("FillPeliculaActor");
		model.addObject("codActor", codActor);
		model.addObject("codFilm", codFilm);
		return model;
	}
	@PostMapping("fillPeliculaActor")
	public String addingActor(FilmActors filmActor) {
		filmactorService.insertFilmActor(filmActor);
		return "FilmActor";
	}
}
