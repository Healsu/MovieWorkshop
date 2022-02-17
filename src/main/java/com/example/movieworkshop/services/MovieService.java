package com.example.movieworkshop.services;

import com.example.movieworkshop.models.Movie;

import java.util.ArrayList;
import java.util.Collection;
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


    public ArrayList<Movie> getSortedPopularity(ArrayList<Movie> movieList){
        Random rand = new Random();
        ArrayList<Movie> popularityList = new ArrayList<>();
        ArrayList<Movie> popularitySorted = new ArrayList<>();

        //Adds 10 random movies to an arraylist
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(movieList.size());
            popularityList.add(movieList.get(randomNumber));
            movieList.remove(randomNumber);
        }

        //Sorts the arraylist by popularity
        Movie highest = null;
        for (int i = 0; i < popularityList.size(); i++) {

            for (int j = 0; j < popularityList.size(); j++) {

                if (popularityList.get(i).getPopularity() > popularityList.get(j).getPopularity()){
                }
                else{
                    highest = popularityList.get(j);
                }
            }
            popularitySorted.add(highest);
        }
        Collections.sort(popularityList);

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
