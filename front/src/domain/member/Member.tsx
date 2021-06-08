import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import MainContent from './mainContent/MainContent';

function Member() {

  return (
    <div className="member-wrapper">
      <div className="member-area-wrapper">
        <MainContent/>
      </div>
    </div>
  )
}

export default Member;