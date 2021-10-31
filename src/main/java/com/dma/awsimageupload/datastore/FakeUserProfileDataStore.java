package com.dma.awsimageupload.datastore;

import com.dma.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "dummyuser1", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "dummyuser2", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "dummyuser3", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
