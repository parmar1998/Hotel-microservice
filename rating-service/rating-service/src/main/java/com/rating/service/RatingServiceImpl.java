package com.rating.service;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repo;

    @Override
    public List<Rating> getRatings() {


        return repo.findAll();
    }

    @Override
    public List<Rating> getRatingByHoteId(String hotelId) {
        return repo.findByHotelId(hotelId);
    }

    @Override
    public Rating create(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return repo.save(rating);
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repo.findByUserId(userId);
    }
}
