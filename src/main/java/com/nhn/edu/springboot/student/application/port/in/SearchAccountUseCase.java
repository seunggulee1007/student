package com.nhn.edu.springboot.student.application.port.in;

import com.nhn.edu.springboot.student.domain.Account;

import java.util.List;

public interface SearchAccountUseCase {

    Account getAccountById(SearchAccountQuery searchAccountQuery);

    List<Account> getAccounts();

}
