package com.dma.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        String s3AccessKey = "AWSAccessKeyId=AKIASK2CSOACQSZP64UK";
        String s3SecretKey = "AWSSecretKey=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";
        AWSCredentials awsCredentials = new BasicAWSCredentials(s3AccessKey, s3SecretKey);

    return AmazonS3ClientBuilder
            .standard()
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();

    };

}
