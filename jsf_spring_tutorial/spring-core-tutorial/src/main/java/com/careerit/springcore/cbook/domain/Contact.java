package com.careerit.springcore.cbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Contact {

        private long id;
        private String name;
        private String email;
        private String mobile;

}
