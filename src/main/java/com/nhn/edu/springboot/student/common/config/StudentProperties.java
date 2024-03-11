package com.nhn.edu.springboot.student.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("nhn.student")
public class StudentProperties {

    private String name;

}
