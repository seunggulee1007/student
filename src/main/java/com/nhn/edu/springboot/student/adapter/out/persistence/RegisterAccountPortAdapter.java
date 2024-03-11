package com.nhn.edu.springboot.student.adapter.out.persistence;

import com.nhn.edu.springboot.student.application.port.out.RegisterAccountPort;
import com.nhn.edu.springboot.student.application.port.out.SearchAccountPort;
import com.nhn.edu.springboot.student.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RegisterAccountPortAdapter implements RegisterAccountPort, SearchAccountPort {

    private final AccountRepository accountRepository;

    @Override
    public Account registerAccount(Account account) {
        AccountEntity accountEntity = AccountEntity.mapToEntity(account);
        accountRepository.save(accountEntity);
        return accountEntity.mapToDomain();
    }

    @Override
    public Account getAccountByQuery(Long id) {
        return accountRepository.findById(id).orElseThrow().mapToDomain();
    }

    @Override
    public List<Account> getAccounts() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        return accountEntities.stream().map(AccountEntity::mapToDomain).toList();
    }

}
