package com.nhn.edu.springboot.student.application.service;

import com.nhn.edu.springboot.student.application.port.in.SearchAccountQuery;
import com.nhn.edu.springboot.student.application.port.in.SearchAccountUseCase;
import com.nhn.edu.springboot.student.application.port.out.SearchAccountPort;
import com.nhn.edu.springboot.student.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchAccountService implements SearchAccountUseCase {

    private final SearchAccountPort searchAccountPort;

    @Override
    public Account getAccountById(SearchAccountQuery searchAccountQuery) {
        long id;
        try {
            id = Long.parseLong(searchAccountQuery.getId());
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 아이디 정보 입니다.");
        }
        return searchAccountPort.getAccountByQuery(id);
    }

    @Override
    public List<Account> getAccounts() {
        return searchAccountPort.getAccounts();
    }

}
