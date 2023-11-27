package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Contact {

        private Long id;
        private String name;
        private String email;
        private String mobile;

}
