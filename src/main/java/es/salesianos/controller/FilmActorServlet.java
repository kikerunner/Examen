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
	public String getFilmActorPage() {
		return "FilmActor";
	}
	
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Film film = ExamAssembler.assembleFilmFrom(req);
		service.addFilm(film);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String codString = req.getParameter("cod");
		if(null != codString) {
			int cod = Integer.parseInt(codString);
			service.searchAndDeleteFilm(cod);
		}
		doAction(req, resp);
	}

	private void doAction(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		List<Film> selectAllFilm = service.listAllFilms();
		req.setAttribute("listAllFilms", selectAllFilm);
		redirect(req, resp);
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/FilmActor.jsp");
		dispatcher.forward(req, resp);
	}*/

}
