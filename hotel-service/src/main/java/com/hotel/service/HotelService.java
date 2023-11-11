package com.hotel.service;

import com.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(String hotelId);

}
