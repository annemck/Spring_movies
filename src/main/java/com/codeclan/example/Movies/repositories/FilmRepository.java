package com.codeclan.example.Movies.repositories;

import com.codeclan.example.Movies.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findFilmsByActorId(Long id);

}
