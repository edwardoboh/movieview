package com.edwardoboh.movieview.repositories;

import com.edwardoboh.movieview.models.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepository extends MongoRepository<Movies, ObjectId> {
    public Optional<Movies> findMoviesByImdbId(String imdbId);
}
