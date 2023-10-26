package com.careerit.cj.day25;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.List;

record Hotel(String name, String type, double pricePerNight,double rating,String city) {}


public class ArrayExample {

    public static void main(String[] args) {
        List<Hotel> hotels = getHotelDetails();
    }
    private static List<String> getHotelsRatingGt(double rating){
        // TODO : Return the list of hotel names whose rating is greater than given rating
        return Collections.emptyList();
    }
    private static List<Hotel> getHotelsByCity(String city){
        // TODO : Return the list of hotels based on city
        return Collections.emptyList();
    }
    // City name should be unique
    private static List<String> getCityNames(){
        // TODO : Return the list of city names
        return Collections.emptyList();
    }
    private static List<String> getHotelNames(List<Hotel> hotels){
        // TODO : Return the list of hotel names
        return Collections.emptyList();
    }
    private static List<Hotel> getHotelDetails(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(ArrayExample.class.getResourceAsStream("/hotel_data.json"), new TypeReference<List<Hotel>>(){});
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
