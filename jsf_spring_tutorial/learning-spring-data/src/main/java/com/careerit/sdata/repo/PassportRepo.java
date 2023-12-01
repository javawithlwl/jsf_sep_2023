package com.careerit.sdata.repo;

import com.careerit.sdata.domain.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PassportRepo extends JpaRepository<Passport, Long> {
}
