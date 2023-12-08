package com.careerit.wsp.service;

import com.careerit.wsp.domain.AppUser;
import com.careerit.wsp.dto.AppUserDto;
import com.careerit.wsp.repo.AppUserRepo;
import com.careerit.wsp.service.exception.UserAlreadyExistsException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@Slf4j
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepo appUserRepo;
    private final ObjectMapper objectMapper;

    @Override
    public AppUserDto registerUser(AppUserDto appUserDto) {

        Assert.notNull(appUserDto,"AppUserDto can't be null");
        Assert.notNull(appUserDto.getUsername(),"Username can't be null");
        Assert.notNull(appUserDto.getEmail(),"Email can't be null");
        Assert.notNull(appUserDto.getPassword(),"Password can't be null");
        Assert.notNull(appUserDto.getMobile(),"Mobile can't be null");
        boolean isUserExists = appUserRepo.existsByMobile(appUserDto.getMobile());
        if(isUserExists){
            throw new UserAlreadyExistsException("User already exists with mobile number : "+appUserDto.getMobile());
        }
        AppUser appUser = objectMapper.convertValue(appUserDto, AppUser.class);
        appUserRepo.save(appUser);
        appUserDto = objectMapper.convertValue(appUser, AppUserDto.class);
        log.info("User is registered with id : {}",appUserDto.getId());
        return appUserDto;
    }
}
