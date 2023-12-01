package com.careerit.sdata.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "number")
    private String number;
    @Column(name = "issued_date")
    private LocalDate issuedDate;
    @Column(name = "expiry_date")
    private LocalDate expiryDate;
    @Column(name = "issued_country")
    private String issuedCountry;
    @OneToOne(mappedBy = "passport")
    private Student student;


}
