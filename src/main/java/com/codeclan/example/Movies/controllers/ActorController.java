package com.codeclan.example.Movies.controllers;

import com.codeclan.example.Movies.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ActorController {

    @Autowired
    ActorRepository actorRepository;

}
