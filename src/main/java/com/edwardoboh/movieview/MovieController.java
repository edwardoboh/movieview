package com.edwardoboh.movieview;

import com.edwardoboh.movieview.models.Movies;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<List<Movies>> getMovies() {
        List<Movies> movies = new ArrayList<Movies>();
        movies.add(new Movies());
        movies.add(new Movies());
        return ResponseEntity.ok(moviesgm);
    }
}
