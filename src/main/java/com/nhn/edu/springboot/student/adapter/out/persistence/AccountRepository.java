package com.nhn.edu.springboot.student.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

}

