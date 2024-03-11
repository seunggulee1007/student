package com.nhn.edu.springboot.student.adapter.in.web.query;

import com.nhn.edu.springboot.student.common.config.AccountProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountTestController {

    private final AccountProperties accountProperties;

    @GetMapping("/account/system/version")
    public AccountProperties getSystemVersion() {
        return accountProperties;
    }

}
