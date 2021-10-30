package com.dma.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String userName;
    private String S3userProfileImageUrl;

    public UserProfile(UUID userProfileId, String userName, String s3userProfileImageUrl) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        S3userProfileImageUrl = s3userProfileImageUrl;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Optional<String> getS3userProfileImageUrl() {
        return Optional.ofNullable(S3userProfileImageUrl);
    }

    public void setS3userProfileImageUrl(String s3userProfileImageUrl) {
        S3userProfileImageUrl = s3userProfileImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfile that = (UserProfile) o;

        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(S3userProfileImageUrl, that.S3userProfileImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, userName, S3userProfileImageUrl);
    }

}
