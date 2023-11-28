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
        private UUID id;
        @Column(name = "name")
        private String name;
        @Column(name = "email")
        private String email;
        @Column(name = "mobile")
        private String mobile;
        @Column(name = "dob")
        private LocalDate dob;

        @PrePersist
        public void init() {
                this.id = UUID.randomUUID();
        }

}
