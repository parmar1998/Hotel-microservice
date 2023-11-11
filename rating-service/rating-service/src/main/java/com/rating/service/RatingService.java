package com.rating.service;

import com.rating.entity.Rating;

import java.util.List;

public interface RatingService {
    //get all by userId
    List<Rating> getRatings();

    //get all by hotel
    List<Rating> getRatingByHoteId(String hotelId)
    ;

    //create
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getRatingByUserId(String userId);
}
