package es.salesianos.service;
import java.util.List;

import org.springframework.stereotype.Service;

import es.salesianos.model.Actor;
import es.salesianos.model.Director;
import es.salesianos.repository.RepositoryActor;


@Service("actorService")
public interface ActorServiceInterface {

	RepositoryActor getRepository();

	void setRepository(RepositoryActor repositoryActor);

	List<Actor> listAllActors();

	void searchAndDeleteActor(Integer codActor);

	void addActor(Actor actor);

	List<Actor> filterAllActor(int beginDate, int endDate);

	List<Actor> selectAllActor();

	Director filterAllDirector(String name);

}
