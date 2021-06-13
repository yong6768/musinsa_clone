import React from 'react';
import { Link } from 'react-router-dom';


type GNB = {
  name: string,
  url: string
}

function makeGNB(name: string, url: string): GNB {
  return {
    name: name,
    url: url
  }
}

function Header() {

  const gnbList = [
    makeGNB('뉴스', '/news'),
    makeGNB('구인', '/news'),
    makeGNB('매거진', '/news'),
    makeGNB('TV', '/news'),
    makeGNB('룩북', '/news'),
    makeGNB('스트립 스냅', '/news'),
    makeGNB('브랜드 스냅', '/news'),
    makeGNB('커뮤니티', '/news'),
    makeGNB('스토어', '/news'),
  ]

  return (
    <div className="top-header clearfix">
      <div className="main-menu">
        {/* title */}
        <Link to="/">
          <h1 className="title">MUSINSA</h1>
        </Link>

        {/* search input */}
        <div className="search-wrapper clearfix">
          <div className="search-input-wrapper">
            <input className="search-input" type="text" autoComplete="off"/>

          </div>
        </div>

        {/* gnb */}
        <div className="gnb">
          <ul className="gnb-list clearfix">
            {gnbList.map((value, index) => (
            <li key={index}>
              <Link to={value.url}>
                {value.name}
              </Link>
            </li>
            ))}
          </ul>
        </div>
      </div>
      <div className="user-menu">
        <ul className="user-menu-list clearfix">
          <li className="loginBtn">
            <Link to={"/member/signIn"}>
              로그인
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span>마이페이지</span>
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span>최근 본 상품</span>
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span className="like">좋아요</span>
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span>장바구니</span>
              <span className="cart-count">0</span>
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span>주문배송조회</span>
            </Link>
          </li>
          <li>
            <Link to={"/member/mypage"}>
              <span>고객센터</span>
            </Link>
          </li>
        </ul>
      </div>
    </div>
  )
}

export default Header;