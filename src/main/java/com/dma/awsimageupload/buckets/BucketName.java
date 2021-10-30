package com.dma.awsimageupload.buckets;

public enum BucketName {

    PROFILE_IMAGE("image-upload-30102021");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
