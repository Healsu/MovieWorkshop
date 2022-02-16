package com.example.movieworkshop.controller;

import com.example.movieworkshop.models.Movie;
import com.example.movieworkshop.repositories.MovieRepository;
import com.example.movieworkshop.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controls {
    MovieRepository Repository = new MovieRepository();
    MovieService Service = new MovieService();

    @GetMapping("/")
    public String test(){

        return "Welcome to my website that analysis movies";
    }


   @GetMapping("/getFirst")
    public String showMovies(){



    return Service.getFirstMovie(Repository.convertFile()).toString();
}
}
