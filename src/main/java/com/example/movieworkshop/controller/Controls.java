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
    public String showMovie(){

       Movie firstMovie = Service.getFirstMovie(Repository.convertFile());

    return firstMovie.toString();
}

    @GetMapping("/getRandom")
    public String showRandMovie(){

        Movie randomMovie = Service.getRandomMovie(Repository.convertFile());

        return randomMovie.toString();
    }

    @GetMapping("/getTenSortByPopularity")
    public String showTenPopularity(){

        Movie firstMovie = Service.getSortedPopularity(Repository.convertFile());
        return null;
    }

    @GetMapping("/howManyWonAwards")
    public String showAwardsGotten(){

        int movieAwards = Service.gotAward(Repository.convertFile());

        return "The amount of movie awards gotten is "+movieAwards;
    }
}
