package com.edwardoboh.movieview;

import com.edwardoboh.movieview.models.Movies;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movies>> getMovies() {
        List<Movies> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("{movieId}")
    public ResponseEntity<Optional<Movies>> getMovieDetails(@PathVariable ObjectId movieId) {
        Optional<Movies> movie = movieService.findMovie(movieId);
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<Movies>> getMovieByImdbId(@PathVariable("imdbId") String imdbId) {
        Optional<Movies> movie = movieService.findMovieByImdbId(imdbId);
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<Movies> addMovie(@RequestBody Movies movie) {
        Movies newMovie = movieService.createMovie(movie);
        return new ResponseEntity<Movies>(newMovie, HttpStatus.CREATED);
    }
}
