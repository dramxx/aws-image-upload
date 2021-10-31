import React from 'react';

const UserProfile = ({id, name, url}) => {

  return (
      <div className="user-profile">
        <h2>{name}</h2>
        <p>{id}</p>
      </div>
  )
}

export default UserProfile
