package com.nhn.edu.springboot.student.application.port.in;

import com.nhn.edu.springboot.student.domain.Account;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterAccountCommand {

    private String number;
    private Integer balance;

    public static RegisterAccountCommand of(String number, Integer balance) {
        return new RegisterAccountCommand(number, balance);
    }

    public Account mapToDomain() {
        return new Account(null, number, balance);
    }

}
