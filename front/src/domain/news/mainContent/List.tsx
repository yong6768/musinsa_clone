import React from 'react';
import NewsItem from '../component/NewsItem';

function NewsList() {

  return (
    <div className="magazine-main-content">
      <div className="header">
        <div className="options">
          <span className="cntLabel">0건 기사</span>
        </div>
      </div>

      <div className="news">
        <div className="section">
          <ul className="news-article-list clearfix">
            {Array.from({length: 10}).map(it => (
              <li className="listItem">
                <NewsItem/>
              </li>
            ))}
          </ul>
        </div>
      </div>
    </div>
  )
}

export default NewsList