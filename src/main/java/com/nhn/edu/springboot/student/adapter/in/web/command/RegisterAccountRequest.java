package com.nhn.edu.springboot.student.adapter.in.web.command;

import com.nhn.edu.springboot.student.application.port.in.RegisterAccountCommand;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class RegisterAccountRequest {

    private String number;
    private Integer balance;

    public RegisterAccountCommand convertCommand() {
        return RegisterAccountCommand.of(number, balance);
    }

}
