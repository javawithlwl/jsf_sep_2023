package com.careerit.dp.creational;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
class Appointment {
    private String name;
    private String email;
    private String phone;
    private LocalDate date;
    private LocalTime time;
    private String doctorName;
    private String hospitalName;
}

public class BuilderPattern {

    public static void main(String[] args) {

        Appointment appointment = Appointment.builder()
                .name("Krish")
                .email("krish@gmail.com")
                .date(LocalDate.now())
                .time(LocalTime.now())
                .doctorName("Dr. Ramesh")
                .hospitalName("Apollo")
                .build();
        System.out.println(appointment);
    }
}
