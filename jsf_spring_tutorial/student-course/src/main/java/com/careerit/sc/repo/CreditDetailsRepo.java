package com.careerit.sc.repo;

import com.careerit.sc.domain.CreditDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditDetailsRepo extends JpaRepository<CreditDetails, Long> {
}
