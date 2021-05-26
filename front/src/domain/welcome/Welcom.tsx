import React from 'react';

import Banner from '../../component/Banner';
import Footer from '../../component/Footer';
import Header from '../../component/Header';
import MainContentLeft from './component/MainContentLeft';
import MainContentRight from './component/MainContentRight';
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
      <div className="main-content-wrapper">
        <MainContentLeft/>
        <MainContentRight/>
        <Footer/>
      </div>

      {/* <Banner image={bannerImage}/>
      <Header/>
      <WelcomeBanner/>
      <Sidebar/>
      <div className="main-content-wrapper">

        {/* 메인 슬라이드 배너 */}
        {/* <MainContentLeft/>
        <MainContentRight/> */}
        
      {/* </div> */}
    </div>
  )
}

export default Welcome;