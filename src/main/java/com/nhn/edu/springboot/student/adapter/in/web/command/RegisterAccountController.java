package com.nhn.edu.springboot.student.adapter.in.web.command;

import com.nhn.edu.springboot.student.application.port.in.RegisterAccountUseCase;
import com.nhn.edu.springboot.student.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterAccountController {

    private final RegisterAccountUseCase registerAccountUseCase;

    @PostMapping("/account")
    public ResponseEntity<Account> registerAccount(@RequestBody RegisterAccountRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(registerAccountUseCase.registerAccount(request.convertCommand()));
    }

}
