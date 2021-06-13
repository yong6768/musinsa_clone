import React from 'react';
import { Link, RouteComponentProps } from 'react-router-dom';
import Footer from '../../component/Footer';
import Header from '../../component/Header';
import { getDisplayFromMagazineType } from '../../utils/DataMapUtils';
import Sidebar from '../welcome/component/Sidebar';
import MainContent from './mainContent/MainContent';

function News() {
  return (
    <div>
      <Header/>
      <Sidebar/>
      <div className="main-content-wrapper">
        {/* main content header */}
        <div className="magazine-header">
          <div className="bread-crumb-wrapper">
            <Link to="/" className="bread-crumb">
              무신사
            </Link>
            {/* <Link to={`/magazines/${magazineType}`} className="bread-crumb">
              {getDisplayFromMagazineType(magazineType)}
            </Link> */}
          </div>
          <div className="bread-crumb-wrapper sub">
            aaa
            aaa
          </div>
          
        </div>

        <MainContent/>

        <Footer/>
      </div>
    </div>
  )

}

export default News;