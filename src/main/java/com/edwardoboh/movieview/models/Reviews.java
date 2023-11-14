package com.edwardoboh.movieview.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    @Id
    private ObjectId id;
    private String message;
    private int rating;

    public Reviews(String message, int rating) {
        this.message = message;
        this.rating = rating;
    }
}
