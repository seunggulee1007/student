package com.nhn.edu.springboot.student.adapter;

import com.nhn.edu.springboot.student.adapter.out.persistence.AccountEntity;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class DummyAccountRepository {

    private final ConcurrentHashMap<String, AccountEntity> accountMap = new ConcurrentHashMap<>();

    //    @Override
    //    public Account save(Account account) {
    //        String pk = account.makePk();
    //        accountMap.put(pk, account);
    //        return account;
    //    }
    //
    //    @Override
    //    public List<Account> findAll() {
    //        List<Account> accounts = new ArrayList<>();
    //        for (Map.Entry<String, Account> entry : accountMap.entrySet()) {
    //            accounts.add(entry.getValue());
    //        }
    //        return accounts;
    //    }
    //
    //    @Override
    //    public Optional<Account> findById(String id) {
    //        return Optional.of(accountMap.get(id));
    //    }

}
