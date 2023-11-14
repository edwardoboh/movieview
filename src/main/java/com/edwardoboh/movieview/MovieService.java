package com.edwardoboh.movieview;

import com.edwardoboh.movieview.models.Movies;
import com.edwardoboh.movieview.repositories.MoviesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    public Optional<Movies> findMovie(ObjectId movieId) {
        return moviesRepository.findById(movieId);
    }

    public Movies createMovie(Movies movie) {
        return moviesRepository.insert(movie);
    }

    public Optional<Movies> findMovieByImdbId(String imdbId) {
        return moviesRepository.findMoviesByImdbId(imdbId);
    }
}
