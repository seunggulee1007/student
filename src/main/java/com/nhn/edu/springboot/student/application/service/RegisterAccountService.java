package com.nhn.edu.springboot.student.application.service;

import com.nhn.edu.springboot.student.application.port.in.RegisterAccountCommand;
import com.nhn.edu.springboot.student.application.port.in.RegisterAccountUseCase;
import com.nhn.edu.springboot.student.application.port.out.RegisterAccountPort;
import com.nhn.edu.springboot.student.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterAccountService implements RegisterAccountUseCase {

    private final RegisterAccountPort registerAccountPort;

    @Override
    public Account registerAccount(RegisterAccountCommand command) {
        return registerAccountPort.registerAccount(command.mapToDomain());
    }

}
