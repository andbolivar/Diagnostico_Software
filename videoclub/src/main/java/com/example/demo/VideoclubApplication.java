package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import DAOMovie.Movie;
import DAOMovie.MovieGenrs;
import movie.ActorRepository;
import movie.Actor_has_MovieRepository;
import movie.MovieGenrsRepository;

@SpringBootApplication
public class VideoclubApplication implements CommandLineRunner {
    @Autowired
    
    private MovieGenrsRepository movieGenrsRepository;
    private Actor_has_MovieRepository actor_Has_MovieRepository;
    private ActorRepository actorRepository;
    private ActorRepository cityRepository;
    private ActorRepository countryRepository;
    

    public static void main(String[] args) {
        SpringApplication.run(VideoclubApplication.class, args);
    }

    @Override
    public void run(String... args) {

    	movieGenrsRepository.save(new MovieGenrs("Category 1", new Movie("Hello Koding 1"), new Movie("Hello Koding 2")));
    }
}