package com.nhn.edu.springboot.student.adapter.in.web;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class StudentRequest {

    private String name;

    private Integer score;

}
