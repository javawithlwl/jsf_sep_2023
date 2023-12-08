package com.careerit.wsp.service;

import com.careerit.wsp.domain.AppUser;
import com.careerit.wsp.domain.Wallet;
import com.careerit.wsp.dto.WalletDto;
import com.careerit.wsp.repo.AppUserRepo;
import com.careerit.wsp.repo.WalletRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class WalletServiceImpl implements WalletService{

    private final WalletRepo walletRepo;
    private final AppUserRepo appUserRepo;

    @Override
    @Transactional
    public WalletDto createWallet(WalletDto walletDto) {
        Assert.notNull(walletDto,"WalletDto can't be null");
        Assert.notNull(walletDto.getUserId(),"UserId can't be null");

        Optional<AppUser> optionalAppUser = appUserRepo.findById(walletDto.getUserId());
        if(optionalAppUser.isEmpty()){
            log.error("User not found with id : {}",walletDto.getUserId());
            throw new RuntimeException("User not found with id : "+walletDto.getUserId());
        }
        if(walletRepo.existsByUserId(walletDto.getUserId())){
            log.error("Wallet already exists for user : {}",walletDto.getUserId());
            throw new RuntimeException("Wallet already exists for user : "+walletDto.getUserId());
        }

        Wallet wallet = new Wallet();
        wallet.setAppUser(optionalAppUser.get());
        wallet.setBalance(walletDto.getBalance());
        walletRepo.save(wallet);
        walletDto.setId(wallet.getId());
        log.info("Wallet is created with id : {}",walletDto.getId());
        return walletDto;
    }
}
