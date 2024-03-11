package com.nhn.edu.springboot.student.domain;

import com.nhn.edu.springboot.student.adapter.out.persistence.AccountEntity;
import com.nhn.edu.springboot.student.adapter.out.persistence.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DefaultAccountService implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public List<AccountEntity> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity save(AccountEntity account) {
        return accountRepository.save(account);
    }

    @Override
    public List<AccountEntity> saveAll(List<AccountEntity> accountList) {
        return accountRepository.saveAll(accountList);
    }

    @Override
    public Optional<AccountEntity> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

}
