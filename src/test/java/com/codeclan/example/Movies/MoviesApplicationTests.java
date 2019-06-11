package com.codeclan.example.Movies;

import com.codeclan.example.Movies.models.Actor;
import com.codeclan.example.Movies.models.Director;
import com.codeclan.example.Movies.models.Film;
import com.codeclan.example.Movies.models.GenreType;
import com.codeclan.example.Movies.repositories.ActorRepository;
import com.codeclan.example.Movies.repositories.DirectorRepository;
import com.codeclan.example.Movies.repositories.FilmRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesApplicationTests {

	@Autowired
	DirectorRepository directorRepository;

	@Autowired
	FilmRepository filmRepository;

	@Autowired
	ActorRepository actorRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFilmAndDirector() {
		Director director = new Director("Guy Ritchie");
		directorRepository.save(director);
		Film film = new Film("Aladdin", director, GenreType.ACTION);
		filmRepository.save(film);
	}

	@Test
	public void canCreateActorAndAddToFilm() {
		Director director = new Director("Shakespeare");
		directorRepository.save(director);
		Film film = new Film("James Bond", director, GenreType.ACTION);
		filmRepository.save(film);
		Actor actor = new Actor("Zoe Dechannel", 750000);
		actorRepository.save(actor);
		actor.addFilm(film);
		actorRepository.save(actor);
	}

//	@Test
//	public void canFindFilmsByActorId() {
//		List<Film> results = filmRepository.findFilmsByActorId(1L);
//	}
}
