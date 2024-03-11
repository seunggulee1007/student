package com.nhn.edu.springboot.student.application.port.out;

import com.nhn.edu.springboot.student.domain.Account;

import java.util.List;

public interface SearchAccountPort {

    Account getAccountByQuery(Long id);

    List<Account> getAccounts();

}
