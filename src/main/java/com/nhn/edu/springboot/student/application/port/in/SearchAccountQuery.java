package com.nhn.edu.springboot.student.application.port.in;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SearchAccountQuery {

    private String id;

    public static SearchAccountQuery of(String id) {
        return new SearchAccountQuery(id);
    }

}
