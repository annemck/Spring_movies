package com.codeclan.example.Movies.components;

import com.codeclan.example.Movies.models.Actor;
import com.codeclan.example.Movies.models.Director;
import com.codeclan.example.Movies.models.Film;
import com.codeclan.example.Movies.models.GenreType;
import com.codeclan.example.Movies.repositories.ActorRepository;
import com.codeclan.example.Movies.repositories.DirectorRepository;
import com.codeclan.example.Movies.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    ActorRepository actorRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Director director = new Director("William Shakespeare");
        directorRepository.save(director);


        Film film = new Film("Hamlet", director, GenreType.COMEDY);
        filmRepository.save(film);
        Film film2 = new Film("James Bond", director, GenreType.ACTION);
        filmRepository.save(film2);


        Actor actor = new Actor("Madonna", 100000000);
        actorRepository.save(actor);
        Actor actor2 = new Actor("Daniel Craig", 90000000);
        actorRepository.save(actor2);

        actor.addFilm(film);
        actor.addFilm(film2);
        actorRepository.save(actor);

        actor2.addFilm(film2);
        actorRepository.save(actor2);

    }
}
