package com.nhn.edu.springboot.student.adapter.out.persistence;

import com.nhn.edu.springboot.student.domain.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private Integer balance;

    public static AccountEntity of(String number, Integer balance) {
        AccountEntity account = new AccountEntity();
        account.number = number;
        account.balance = balance;
        return account;
    }

    public static AccountEntity mapToEntity(Account account) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.number = account.number();
        accountEntity.balance = account.balance();
        return accountEntity;
    }

    public Account mapToDomain() {
        return new Account(this.id, this.number, this.balance);
    }

}
