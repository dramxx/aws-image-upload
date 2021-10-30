package com.dma.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.System.getenv;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        String s3AccessKey = getenv("S3_ACCESS_KEY");
        String s3SecretKey = getenv("S3_SECRET_KEY");
        AWSCredentials awsCredentials = new BasicAWSCredentials(s3AccessKey, s3SecretKey);

    return AmazonS3ClientBuilder
            .standard()
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();

    };

}
