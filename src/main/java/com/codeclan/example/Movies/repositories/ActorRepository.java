package com.codeclan.example.Movies.repositories;

import com.codeclan.example.Movies.models.Actor;
import com.codeclan.example.Movies.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {



}
