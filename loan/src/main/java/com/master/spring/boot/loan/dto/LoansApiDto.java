package com.master.spring.boot.loan.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "loans")
public class LoansApiDto {
    String env;
    String version;
}
