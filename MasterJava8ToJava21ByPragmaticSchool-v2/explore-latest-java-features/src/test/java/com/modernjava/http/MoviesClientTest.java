package com.modernjava.http;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@Disabled
public class MoviesClientTest {

    MoviesClient moviesClient = new MoviesClient();

    @Test
    void getMoviesByIdTest() throws IOException, InterruptedException {
        var movie = moviesClient.getMovieById();
        assertNotNull(movie);
    }

    @Test
    void getAllMoviesTest() throws IOException, InterruptedException {
        var moviesList = moviesClient.getAllMovies();
        assert !moviesList.isEmpty();
    }

    @Test
    void getMoviesByIdTestAsync()  {
        var movie = moviesClient.getMovieByIdAsync().join();
        assertNotNull(movie);
    }

}
