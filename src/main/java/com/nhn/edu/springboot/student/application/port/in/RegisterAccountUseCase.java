package com.nhn.edu.springboot.student.application.port.in;

import com.nhn.edu.springboot.student.domain.Account;

public interface RegisterAccountUseCase {

    Account registerAccount(RegisterAccountCommand command);

}
