package es.salesianos.service;

import java.util.List;

import org.springframework.context.annotation.Profile;

import es.salesianos.model.Actor;
import es.salesianos.repository.RepositoryActor;

@org.springframework.stereotype.Service("actorService")
@Profile("Prueba")
public class ActorService2 implements ActorServiceInterface {
	private RepositoryActor repositoryActor = new RepositoryActor();

	public RepositoryActor getRepository() {
		return repositoryActor;
	}

	public void setRepository(RepositoryActor repositoryActor) {
		this.repositoryActor = repositoryActor;
	}
	
	public List<Actor> listAllActors() {
		return repositoryActor.searchAllActors();
	}

	public void searchAndDeleteActor(Integer codActor) {
		repositoryActor.DeleteActorById(codActor);
	}

	public void addActor(Actor actor) {
		System.out.println("Salvando:" + actor.getName());
	}

	public List<Actor> filterAllActor(int beginDate, int endDate) {
		return repositoryActor.filterByYearOfDateBetween(beginDate, endDate);
	}

	public List<Actor> selectAllActor() {
		return repositoryActor.selectAllActor();
	}

	public Actor filterAllDirector(String name) {
		return repositoryActor.filterAllActor(name);
	}
}
