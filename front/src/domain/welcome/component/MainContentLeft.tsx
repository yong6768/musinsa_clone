import React, { useState } from 'react';
import NewsItem from '../../news/component/NewsItem';

function MainContentLeft() {
  const tabHeader = ['뉴스', '매거진', 'TV', '룩북']

  const [activeTab, setActiveTab] = useState(tabHeader[0])

  return ( 
    <div className="main-content-left main-content">
      <div className="section tabBox">
        <div className="header">
          <ul className="clearfix">
            {tabHeader.map((tab, index) => (
              <li className="tabMenu"><span>{tab}</span></li>
            ))}
            <li className="tabMenu all"><span>전체</span></li>
          </ul>
        </div>


        <div className="content-wrapper tab news">
          <ul className="news-article-list clearfix">
            {Array.from({length: 10}, () => 0).map(value => {
              return (<NewsItem/>)
            })
            }
          </ul>
        </div>

      </div>



      
      <div className="section no-bottom-line">
        <h1>브랜드 구인 더미</h1>
        {Array.from({length: 10}, () => 0).map(value => {
          return (<div>더미</div>)
        })
        }
      </div>
    </div>
  )
}

export default MainContentLeft;