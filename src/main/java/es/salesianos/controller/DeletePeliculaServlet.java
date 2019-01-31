package es.salesianos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.salesianos.service.FilmService;
@Controller
public class DeletePeliculaServlet {
	@Autowired
	@Qualifier("filmService")
	private FilmService filmService;
	
	@GetMapping("deletePeliucla")
	protected String searchingAndDeletingActor(@RequestParam int codPelicula){
		filmService.searchAndDeleteFilm(codPelicula);
		return "addPelicula";
	}
}
