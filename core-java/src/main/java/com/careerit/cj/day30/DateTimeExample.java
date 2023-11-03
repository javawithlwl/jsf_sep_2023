package com.careerit.cj.day30;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DateTimeExample {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate dateAfter10Days = date.plusDays(10);
        System.out.println(dateAfter10Days);

        long days=ChronoUnit.MINUTES.between(time,time.plusMinutes(10));
        System.out.println(days);

        String dateStr = "06-08-2021";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dateStr,formatter);
        System.out.println(dob);
        System.out.println(dob.getDayOfWeek().name());
    }
}
