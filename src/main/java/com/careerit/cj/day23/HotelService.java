package com.careerit.cj.day23;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    private List<Hotel> hotels;

    public HotelService() {
        hotels = JsonReaderUtil.loadHotelData();
    }

    public void showHotels() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public List<Hotel> filterHotels(HotelFilter hotelFilter) {
        List<Hotel> filteredList = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotelFilter.test(hotel)) {
                filteredList.add(hotel);
            }
        }
        return filteredList;
    }

    /*public List<Hotel> getHotels(HotelType hotelType) {
        List<Hotel> hotel5StarList = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getType() == hotelType) {
                hotel5StarList.add(hotel);
            }
        }
        return hotel5StarList;
    }

    public List<Hotel> getHotels(String city) {
        List<Hotel> filteredByCityList = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getCity().equalsIgnoreCase(city)) {
                filteredByCityList.add(hotel);
            }
        }
        return filteredByCityList;
    }

    public List<Hotel> getHotels(HotelType hotelType, String city) {
        List<Hotel> filteredByCityAndTypeList = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getCity().equalsIgnoreCase(city) && hotel.getType() == hotelType) {
                filteredByCityAndTypeList.add(hotel);
            }
        }
        return filteredByCityAndTypeList;
    }

    public List<Hotel> getHotels(float rating) {
        List<Hotel> filteredByRatingList = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getRating() >= rating) {
                filteredByRatingList.add(hotel);
            }
        }
        return filteredByRatingList;
    }*/


}
