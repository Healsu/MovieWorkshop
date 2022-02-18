package com.example.movieworkshop.models;

import java.util.ArrayList;

public class Movie implements Comparable<Movie>{
    ArrayList<Movie> MovieList = new ArrayList();
    private int movieYear;
    private int movieLenght;
    private String movieName;
    private String subject;
    private int popularity;
    private boolean wonAnAward;

    public Movie(int movieYear, int movieLenght, String movieName, String subject, int popularity, boolean wonAnAward) {
        this.movieYear = movieYear;
        this.movieLenght = movieLenght;
        this.movieName = movieName;
        this.subject = subject;
        this.popularity = popularity;
        this.wonAnAward = wonAnAward;
    }

    public Movie getFirst(){
        return MovieList.get(0);

    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public int getMovieLenght() {
        return movieLenght;
    }

    public void setMovieLenght(int movieLenght) {
        this.movieLenght = movieLenght;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isWonAnAward() {
        return wonAnAward;
    }

    public void setWonAnAward(boolean wonAnAward) {
        this.wonAnAward = wonAnAward;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "MovieList=" + MovieList +
                ", movieYear=" + movieYear +
                ", movieLenght=" + movieLenght +
                ", movieName='" + movieName + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", wonAnAward=" + wonAnAward +
                '}'+"<br>";
    }

    @Override
    public int compareTo(Movie o) {
        if (popularity == o.getPopularity()){
            return 0;
        }else if (popularity < o.getPopularity()){
            return 1;
        } else {
            return -1;
        }

    }
}
