import React, { useState } from 'react';
import { Link } from 'react-router-dom';

enum LoginType {USER, ANONYMOUS}

function SignIn() {
  const [loginType, setLoginType] = useState<LoginType>(LoginType.USER)

  return (
    <div className="member-area">
      <header className="member-header">
        <div className="header-area">
          <h2 className="title">로그인</h2>
        </div>
        <div className="header-tab">
          <span className={`header-tab-link ${loginType==LoginType.USER?'active':''}`} 
            onClick={() => setLoginType(LoginType.USER)}>
            기존 회원
          </span>
          <span className={`header-tab-link ${loginType==LoginType.ANONYMOUS?'active':''}`}
            onClick={() => setLoginType(LoginType.ANONYMOUS)}>
            비회원 주문조회
          </span>
        </div>
      </header>

      <div className="member-form">
        {loginType == LoginType.USER ? 
        // 기존 회원 로그인
        <div className="user">
          <input type="text" name="id" className="n-input" 
            placeholder="아이디를 입력해 주세요."/>
          <input type="password" name="password" className="n-input" 
            placeholder="비밀번호를 입력해 주세요."/>
          <button className="submitBtn">로그인</button>
          <div className="login-help-feature">
            <div className="login-auto">
              <input type="checkbox" className="auto-checkbox" name="autologin"/>
              <label htmlFor="autologin" className="auto-label">
                자동로그인
              </label>
            </div>
            <div className="login-find">
              <Link to="/">아이디 찾기</Link>
              <span/>
              <Link to="/">비밀번호 찾기</Link>
            </div>
          </div>
        </div>
        :
        // 비회원 주문조회
        <div className="anonymous">

        </div>
        }
      </div>

      <p className="login-guide-text">
        무신사 회원 혜택을 받아보세요 <Link to="/member/signup">회원가입</Link>
      </p>
    </div>
  )
}

export default SignIn;