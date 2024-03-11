package com.nhn.edu.springboot.student.application.port.out;

import com.nhn.edu.springboot.student.domain.Account;

public interface RegisterAccountPort {

    Account registerAccount(Account account);

}
