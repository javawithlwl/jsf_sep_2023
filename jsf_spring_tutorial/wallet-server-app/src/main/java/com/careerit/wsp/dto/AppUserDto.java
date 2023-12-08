package com.careerit.wsp.dto;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AppUserDto {
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String mobile;
}
