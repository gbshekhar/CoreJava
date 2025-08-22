package com.modernjava.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.net.http.HttpRequest.newBuilder;

public class MoviesClient {

    HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(2))
            .build();

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    public static String ALL_MOVIES_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movies.json";
    public static String MOVIE_BY_ID_URL = "http://127.0.0.1:8000/explore-latest-java-features/src/main/resources/movie_by_id.json";

    public Movie getMovieById() throws IOException, InterruptedException {
        var httpRequest = requestBuilder(MOVIE_BY_ID_URL);
        var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), Movie.class);

    }

    public CompletableFuture<Movie> getMovieByIdAsync()  {
        var httpRequest = requestBuilder(MOVIE_BY_ID_URL);
        var response = client.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.thenApply(httpResponse -> {
            try {
                return objectMapper.readValue(httpResponse.body(), Movie.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static HttpRequest requestBuilder(String url) {
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }

    public List<Movie> getAllMovies() {
        var httpRequest = requestBuilder(ALL_MOVIES_URL);
        HttpResponse<String> response = null;
        try {
            response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return objectMapper.readValue(response.body(), new TypeReference<List<Movie>>() {
                @Override
                public Type getType() {
                    return super.getType();
                }
            });
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }


    }

}
