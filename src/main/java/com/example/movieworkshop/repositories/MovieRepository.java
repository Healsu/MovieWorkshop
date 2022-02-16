package com.example.movieworkshop.repositories;
import com.example.movieworkshop.models.Movie;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieRepository {


        private static String fileName = "src/main/resources/imdb-data.csv";
        static ArrayList<Movie> totalMovies = new ArrayList<Movie>();

        public static ArrayList<Movie> convertFile() {
                try {
                        File file = new File(fileName);
                        Scanner sc = new Scanner(file);

                        while (sc.hasNextLine()) {
                                String line = sc.nextLine();
                                String[] movies = line.split(";");
                                int movieYear = Integer.parseInt(movies[0]);
                                int movieLenght = Integer.parseInt(movies[1]);
                                String movieName = movies[2];
                                String subject = movies[3];
                                int popularity = Integer.parseInt(movies[4]);
                                boolean wonAnAward = false;
                                if (movies[5].equalsIgnoreCase("Yes")) {
                                        wonAnAward = true;
                                } else {
                                        wonAnAward = false;
                                }
                                Movie movie = new Movie(movieYear, movieLenght, movieName, subject, popularity, wonAnAward);
                                totalMovies.add(movie);
                        }
                } catch (Exception e) {
                        System.out.println("File not found");
                }
        return totalMovies;
        }
        }


