package com.example.movieworkshop.services;

import com.example.movieworkshop.models.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MovieService {

    //Show the first movie on the list
    public Movie getFirstMovie(ArrayList<Movie> movieList){
        return movieList.get(0);
    }

    //Get a random movie from the list
    public Movie getRandomMovie(ArrayList<Movie> movieList){
        Random random = new Random();
        int limit = 100;
        int randomNumber = random.nextInt(limit);

        return movieList.get(randomNumber);

    }


    public Movie getSortedPopularity(ArrayList<Movie> movieList){

        for (int i = 0; i < movieList.size(); i++) {
            movieList.get(i).getPopularity();
        }
        return null;
    }

    //Show how many movies got an award from the list
    public int gotAward(ArrayList<Movie> movieList){
        int awards = 0;

        for (int i = 0; i < movieList.size(); i++) {

            if (movieList.get(i).isWonAnAward() == true){
                awards++;
            }
        }
        return awards;
    }

    public ArrayList<Movie> showWhoGotAward(ArrayList<Movie> movieList){
        ArrayList<Movie> awardList = new ArrayList<>();
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).isWonAnAward() == true){
                awardList.add(movieList.get(i));
            }
        }
        return awardList;
    }
}
