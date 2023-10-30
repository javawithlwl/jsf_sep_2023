package com.careerit.cj.day23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class HotelManager {

    public static void main(String[] args) {

        HotelService service = new HotelService();
        service.showHotels();

        // 1. Find all the five_star hotels

        System.out.println("------------Five star hotels----------------");

        List<Hotel> fiveStarList = service.filterHotels(hotel -> hotel.getType() == HotelType.FIVE_STAR);

        System.out.println(fiveStarList);

        // 2. Find all hotels rating greater than or equal to 4.5

        System.out.println("------------Rating greater than or equal to 4.5----------------");
        List<Hotel> ratingList = service.filterHotels((hotel) -> hotel.getRating() >= 4.5f);
        System.out.println(ratingList);

        // java8 lambda expression

        // () -> {}
        // (a) ->  a * a;
        // (a,b) -> {
        //      sop(a);
        //      sop(b);
        //      return a + b;
        // }


    }

    public static void test() {
        JButton testButton = new JButton("Test Button");
        testButton.addActionListener(ae-> System.out.println("Click Detected by Anon Class"));
    }
}
