package com.nhn.edu.springboot.student.domain;

import com.nhn.edu.springboot.student.adapter.out.persistence.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

}