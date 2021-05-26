import React from 'react';

function MainContentRight() {

  return (
    <div className="main-content-right main-content">
      <div className="section tabBox">
        <div className="header">
          <ul className="clearfix">
            <li className="tabMenu"><span>브랜드 스탭</span></li>
            <li className="tabMenu"><span>스트릿 스냅</span></li>
            <li className="tabMenu all"><span>전체</span></li>
          </ul>
        </div>

        ㅁㄴㅇㄹ<br/>
        ㅁㄴㅇㄹ<br/>
        ㅁㄴㅇㄹ<br/>
      </div>

      <div className="section">
        <h1>브랜드 홍보 더미</h1>
        {Array.from({length: 5}, () => 0).map(value => {
          return (<div>더미</div>)
        })
        }
      </div>

      <div className="section tabBox">
        <div className="header">
          <ul className="clearfix">
            <li className="tabMenu"><span>최신글</span></li>
            <li className="tabMenu"><span>최신 사진</span></li>
            <li className="tabMenu all"><span>전체</span></li>
          </ul>
        </div>


        ㅁㄴㅇㄹ<br/>
        ㅁㄴㅇㄹ<br/>
        ㅁㄴㅇㄹ<br/>
      </div>

    </div>
  )
}

export default MainContentRight;