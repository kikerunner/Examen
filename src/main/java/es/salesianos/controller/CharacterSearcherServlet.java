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
		FilmActors selectPeliculaActor = filmactorService.filterAllPeliculaActor(role);
		ModelAndView model = new ModelAndView("characterSearcher");
		model.addObject("selectPeliculaActor", selectPeliculaActor);
		return model;
	}

	/*@PostMapping("LoadFilmsList")
	public ModelAndView getListActors(String role) {
		ModelAndView model = new ModelAndView("addPelicula");
		model.addObject("listAllFilms", films);
		return model;
	}
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doAction(req, resp);
	}

	private void doAction(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String role = req.getParameter("role");
		if (role != null) {
			FilmActors selectFilmActor = service.filterAllPeliculaActor(role);
			req.setAttribute("selectPeliculaActor", selectFilmActor);
		}
		redirect(req, resp);
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/characterSearcher.jsp");
		dispatcher.forward(req, resp);
	}*/
}
