package com.nhn.edu.springboot.student.domain;

import com.nhn.edu.springboot.student.adapter.out.persistence.AccountEntity;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<AccountEntity> getAccounts();

    AccountEntity save(AccountEntity account);

    List<AccountEntity> saveAll(List<AccountEntity> accountList);

    Optional<AccountEntity> getAccountById(Long id);

}
