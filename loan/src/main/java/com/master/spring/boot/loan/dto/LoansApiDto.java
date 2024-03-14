package com.master.spring.boot.loan.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "loans")
public record LoansApiDto(String env,String version) {
}
