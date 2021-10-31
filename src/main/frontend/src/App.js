import React, {useEffect, useState} from 'react';
import "./App.css";
import axios from 'axios';
import {SERVER_URI, USER_PROFILE_URI} from "./utils/config"
import UserProfile from './Components/UserProfile';

function App() {

  const [userProfiles, setUserProfiles] = useState(null)

  useEffect(() => {
    axios.get(`${SERVER_URI}${USER_PROFILE_URI}`)
      .then(response => setUserProfiles(response.data))
      .catch(error => console.log(error))
  }, [])

  return (
    <div className="app">
      {
        userProfiles && userProfiles.map(user =>
            <UserProfile
                key={user.userProfileId}
                id={user.userProfileId}
                name={user.userName}
                url={user.s3userProfileImageUrl}
            />)
      }
    </div>
  );
}

export default App;
