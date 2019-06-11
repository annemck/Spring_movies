package com.codeclan.example.Movies.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @JsonIgnoreProperties("films")
    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;
    @Column
    @Enumerated(value = EnumType.STRING)
    private GenreType genre;
    @JsonIgnoreProperties("films")
    @ManyToMany
    @JoinTable(
            name = "actors_films",
            joinColumns = { @JoinColumn(
                    name = "film_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "actor_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Actor> actors;

    public Film(String title, Director director, GenreType genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actors = new ArrayList<>();
    }
    public Film(){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public GenreType getGenre() {
        return genre;
    }

    public void setGenre(GenreType genre) {
        this.genre = genre;
    }
}
