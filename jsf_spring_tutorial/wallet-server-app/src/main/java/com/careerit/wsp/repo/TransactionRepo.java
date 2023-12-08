package com.careerit.wsp.repo;

import com.careerit.wsp.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepo extends JpaRepository<Transaction, UUID> {
}
