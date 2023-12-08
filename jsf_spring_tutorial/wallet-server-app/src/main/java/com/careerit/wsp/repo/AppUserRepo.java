package com.careerit.wsp.repo;

import com.careerit.wsp.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AppUserRepo extends JpaRepository<AppUser, UUID> {

        @Query("select count(u) > 0 from AppUser u where u.mobile = :mobile and u.deleted = false")
        boolean existsByMobile(String mobile);
}
