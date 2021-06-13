import { Match } from '@testing-library/dom';
import React from 'react';
import { Link, RouteComponentProps } from 'react-router-dom';
import Header from '../../component/Header';
import { getDisplayFromMagazineType } from '../../utils/DataMapUtils';
import Sidebar from '../welcome/component/Sidebar';
import MagazineMainContent from './mainContent/MagazineMainContent';

type MagazineProps = {
  type: string
}

function Magazine(props: RouteComponentProps<MagazineProps>) {
  const magazineType = props.match.params.type
  console.log(magazineType)

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
            <Link to={`/magazines/${magazineType}`} className="bread-crumb">
              {getDisplayFromMagazineType(magazineType)}
            </Link>
          </div>
          <div className="bread-crumb-wrapper sub">
            aaa
            aaa
          </div>
          
        </div>

        <MagazineMainContent/>
      </div>
    </div>
  )

}

export default Magazine;