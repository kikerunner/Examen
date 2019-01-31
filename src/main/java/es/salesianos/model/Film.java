package es.salesianos.model;

import java.util.List;

public class Film {
	private Integer cod;
	private String title;
	private Integer codDirector;
	private Director director;
	private List<FilmActors> peliculaActor;
	
	public Integer getcod() {
		return cod;
	}
	public void setcod(Integer cod) {
		this.cod = cod;
	}
	
	public Integer getCodDirector() {
		return codDirector;
	}

	public void setCodDirector(Integer Codowner) {
		codDirector = Codowner;
	}
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<FilmActors> getFilmActor() {
		return peliculaActor;
	}

	public void setFilmActor(List<FilmActors> peliculaActor) {
		this.peliculaActor = peliculaActor;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
}
