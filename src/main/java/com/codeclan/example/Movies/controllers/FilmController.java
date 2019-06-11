package com.codeclan.example.Movies.controllers;

import com.codeclan.example.Movies.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmController {

    @Autowired
    FilmRepository filmRepository;

}
