package com.edwardoboh.movieview.repositories;

import com.edwardoboh.movieview.models.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MoviesRepository extends MongoRepository<Movies, ObjectId> {
    public Optional<Movies> findMoviesByImdbId(String imdbId);
}
