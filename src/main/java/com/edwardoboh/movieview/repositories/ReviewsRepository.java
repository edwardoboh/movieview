package com.edwardoboh.movieview.repositories;

import com.edwardoboh.movieview.models.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewsRepository extends MongoRepository<Reviews, ObjectId> {
}
