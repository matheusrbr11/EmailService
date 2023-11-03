package com.emailservice.infra.ses;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSesConfig {

    private String awsAccessKey;
    private String awsSecretKey;
    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider( new BasicAWSCredentials("AKIAY5LATFEEROZCTCXK","DgkIDJVim4IUJKxWwdlmhlY4GQM0adzVtwTEOxa7")))
                .withRegion(Regions.US_EAST_1)
                .build();
    }
}