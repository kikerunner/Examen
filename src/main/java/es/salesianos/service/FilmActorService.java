package es.salesianos.service;



import es.salesianos.model.DtoActorFilm;
import es.salesianos.model.FilmActors;
import es.salesianos.repository.RepositoryFilmActors;

@org.springframework.stereotype.Service("filmActorService") 
public class FilmActorService {

	private RepositoryFilmActors repositoryFilmActors = new RepositoryFilmActors();

	public RepositoryFilmActors getRepository() {
		return repositoryFilmActors;
	}

	public void setRepository(RepositoryFilmActors repositoryFilmActors) {
		this.repositoryFilmActors = repositoryFilmActors;
	}
	
	public void insertFilmActor(FilmActors peliculaActor) {
		repositoryFilmActors.insertFilmActors(peliculaActor);
	}

	public DtoActorFilm filterAllPeliculaActor(String role) {
		return repositoryFilmActors.filterAllPeliculaActor(role);
	}


}
