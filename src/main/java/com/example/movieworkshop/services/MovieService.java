package com.example.movieworkshop.services;

import com.example.movieworkshop.models.Movie;

import java.util.ArrayList;

public class MovieService {

    public Movie getFirstMovie(ArrayList<Movie> movieList){
        return movieList.get(0);
    }

}
