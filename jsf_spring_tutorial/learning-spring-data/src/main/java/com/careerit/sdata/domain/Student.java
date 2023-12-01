package com.careerit.sdata.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "email")
        private String email;
        @Column(name = "mobile")
        private String mobile;
        @Column(name = "dob")
        private LocalDate dob;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "passport")
        private Passport passport;


}
