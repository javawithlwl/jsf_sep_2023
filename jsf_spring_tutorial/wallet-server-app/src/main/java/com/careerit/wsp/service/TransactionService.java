package com.careerit.wsp.service;

import com.careerit.wsp.dto.TransactionDto;

public interface TransactionService {

        TransactionDto transferAmount(TransactionDto transactionDto);
}
