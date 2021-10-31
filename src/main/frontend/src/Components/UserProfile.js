import React from "react";
import DropZone from './DropZone';

const UserProfile = ({ id, name, url }) => {
  return (
    <div className="user-profile">
      <h2>{name}</h2>
      <p>{id}</p>
      <DropZone />
    </div>
  );
};

export default UserProfile;
