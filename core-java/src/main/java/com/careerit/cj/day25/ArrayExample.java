package com.careerit.cj.day25;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Hotel(String name, String type, double pricePerNight, double rating, String city) {
}


public class ArrayExample {

    public static void main(String[] args) {
        List<Hotel> hotels = getHotelDetails();
    }

    private static List<String> getHotelsRatingGt(List<Hotel> hotels, double rating) {
       /* List<String> list = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.rating() > rating) {
                list.add(hotel.name());
            }
        }
        return list;*/
        return hotels.stream()
                .filter(hotel->hotel.rating()>rating)
                .map(Hotel::name)
                .toList();
    }

    private static List<Hotel> getHotelsByCity(List<Hotel> hotels, String city) {
        /*List<Hotel> list = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.city().equalsIgnoreCase(city)) {
                list.add(hotel);
            }
        }
        return list;*/
        return hotels.stream()
                .filter(hotel->hotel.city().equalsIgnoreCase(city))
                .toList();
    }

    // City name should be unique
    private static List<String> getCityNames(List<Hotel> hotels) {
        /*List<String> list = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (!list.contains(hotel.city())) {
                list.add(hotel.city());
            }
        }
        return list;*/
        return hotels.stream()
                .map(Hotel::city)
                .distinct()
                .toList();
    }

    private static List<String> getHotelNames(List<Hotel> hotels) {
       /* List<String> list = new ArrayList<>();
        for (Hotel hotel : hotels) {
            list.add(hotel.name());
        }
        return list;*/
        return hotels.stream()
                .map(Hotel::name)
                .toList();
    }

    private static List<Hotel> getHotelDetails() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(ArrayExample.class.getResourceAsStream("/hotel_data.json"), new TypeReference<List<Hotel>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
