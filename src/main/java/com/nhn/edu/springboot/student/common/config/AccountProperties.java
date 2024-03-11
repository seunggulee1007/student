package com.nhn.edu.springboot.student.common.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Setter
@ConfigurationProperties("com.nhn.account.system")
@ToString
public class AccountProperties {

    private String version;

}
