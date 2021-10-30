package com.dma.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Value("${S3_ACCESS_KEY}")
    private String s3AccessKey;

    @Value("${S3_SECRET_KEY}")
    private String s3SecretKey;

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(s3AccessKey, s3SecretKey);

    return AmazonS3ClientBuilder
            .standard()
            .withRegion(Regions.DEFAULT_REGION)
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();

    };

}
