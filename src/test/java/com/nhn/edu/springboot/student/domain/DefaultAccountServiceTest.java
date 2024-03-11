package com.nhn.edu.springboot.student.domain;

import com.nhn.edu.springboot.student.adapter.out.persistence.AccountEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DefaultAccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    @DisplayName("계좌를 전체 조회하는 메서드")
    @Transactional
    void accountTest() {

        // given
        AccountEntity account = AccountEntity.of("110-224-50193", 10000000);
        List<AccountEntity> accountList = new ArrayList<>();
        accountList.add(account);
        accountList.add(AccountEntity.of("110-224-50194", 10000000));
        accountService.saveAll(accountList);

        // when
        List<AccountEntity> accounts = accountService.getAccounts();
        // then
        assertThat(accounts).hasSize(accountList.size());
        assertTrue(accounts.stream().anyMatch(a -> Objects.equals(a.getBalance(), account.getBalance())));
        assertTrue(accounts.stream().anyMatch(a -> Objects.equals(a.getNumber(), account.getNumber())));

        Optional<AccountEntity> accountById = accountService.getAccountById(account.getId());
        assertTrue(accountById.isPresent());
        assertThat(account).isSameAs(accountById.get());
    }

}