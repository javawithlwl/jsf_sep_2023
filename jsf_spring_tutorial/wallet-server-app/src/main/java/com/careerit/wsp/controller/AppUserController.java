package com.careerit.wsp.controller;

import com.careerit.wsp.dto.AppUserDto;
import com.careerit.wsp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appuser")
@RequiredArgsConstructor
public class AppUserController {

        private final AppUserService appUserService;

        @PostMapping("/register")
        public ResponseEntity<AppUserDto> registerUser(@RequestBody AppUserDto appUserDto){
            AppUserDto registeredUser = appUserService.registerUser(appUserDto);
            return ResponseEntity.ok(registeredUser);
        }
}
