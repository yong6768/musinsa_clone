import React from 'react';


import Banner from '../../component/Banner';
import Header from '../../component/Header';
import Sidebar from './component/Sidebar';
import WelcomeBanner from './component/WelcomeBanner';

function Welcome() {

  const bannerImage = 'https://image.musinsa.com/mfile_s01/_mainbanners/new2021-05/img60a1f55c7ec9e.jpg';
  

  return (
    <div>
      <Banner image={bannerImage}/>
      <Header/>
      <WelcomeBanner/>
      <Sidebar/>
      <div className="main-content">

        
      </div>
    </div>
  )
}

export default Welcome;