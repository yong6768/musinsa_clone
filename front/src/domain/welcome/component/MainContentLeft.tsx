import React, { useState } from 'react';
import { Link } from 'react-router-dom';

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
              return (<NewsComponent/>)
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

function NewsComponent() {

  return (
    <li className="list-item">
      <div className="articleImg">
        <Link to="#">
          <img />
        </Link>
      </div>

      <div className="articleInfo">
        <Link to="#">
          <p className="title">
            패션 | 무신사 투표 : 핫 서버에 어올리는 숏 팬츠
          </p>
        </Link>
        <div className="subInfo">
          <span>시간</span>
          <span>조회수</span>
          <span>브랜드</span>
        </div>
        <div className="description">
          <Link to="#">
            <p>
              무더운 여름 더위도 걱정 없는 인기 브랜드의 숏 팬츠에 투표하자. 무신사가 선별한 아이템 중 마음에 드는 상품에 한 표를 행사하고 댓글 이벤트에 참여해보자. 무신사 포인트를 얻는 가장 쉬운 방법 중 하나다. 지금 보고 있는 뉴스의 URL을 개인 SNS 계정에 공유하고 코멘트를 남기면 된다. 그다음 그 게시물의 U...
            </p>
          </Link>
          
        </div>
      </div>
    </li>
  )
}

export default MainContentLeft;