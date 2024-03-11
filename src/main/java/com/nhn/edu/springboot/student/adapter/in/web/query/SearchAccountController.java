package com.nhn.edu.springboot.student.adapter.in.web.query;

import com.nhn.edu.springboot.student.application.port.in.SearchAccountQuery;
import com.nhn.edu.springboot.student.application.port.in.SearchAccountUseCase;
import com.nhn.edu.springboot.student.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchAccountController {

    private final SearchAccountUseCase searchAccountUseCase;

    @GetMapping("/account/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String id) {
        return ResponseEntity.ok(searchAccountUseCase.getAccountById(SearchAccountQuery.of(id)));
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts() {
        return ResponseEntity.ok(searchAccountUseCase.getAccounts());
    }

}
