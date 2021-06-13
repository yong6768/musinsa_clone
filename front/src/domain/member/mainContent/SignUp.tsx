import React, { useState } from 'react';

function SignUp() {
  return (
    <div className="member-area">
      <header className="member-header">
        <div className="header-area">
          <h1 className="title">MUSINSA 회원가입</h1>
        </div>
      </header>

      <div className="member-form">
        <div className="signUp">
          <div className="pt-20">
            <label htmlFor="id" className="input-label">아이디</label>
            <input type="text" name="id" id="id" className="n-input" 
              placeholder="아이디 입력(5~11자)"/>
          </div>
          
          <div className="pt-20">
            <label htmlFor="password" className="input-label">비밀번호</label>
            <input type="password" name="password" id="password" className="n-input" 
              placeholder="비밀번호(숫자,영문,특수문자 조합 최소 8자)"/>
            <input type="password" name="passwordConf" id="passwordConf" className="n-input" 
              placeholder="비밀번호 확인"/>
          </div>
          
          <div className="pt-20">
            <label htmlFor="email" className="input-label">이메일</label>
            <input type="email" name="email" id="email" className="n-input" 
              placeholder="이메일"/>
          </div>

          <div className="pt-20"/>
          <div className="checkbox-row">
            <input type="checkbox" className="auto-checkbox" name="autologin"/>
            <label htmlFor="autologin" className="auto-label">
              약관 전체동의
            </label>
          </div>
          <div className="checkbox-row">
            <input type="checkbox" className="auto-checkbox" name="autologin"/>
            <label htmlFor="autologin" className="auto-label">
              개인정보 수집 이용동의(필수)
            </label>
          </div>
          <div className="checkbox-row">
            <input type="checkbox" className="auto-checkbox" name="autologin"/>
            <label htmlFor="autologin" className="auto-label">
              무신사, 무신사스토어 이용약관(필수)
            </label>
          </div>
          <div className="checkbox-row">
            <input type="checkbox" className="auto-checkbox" name="autologin"/>
            <label htmlFor="autologin" className="auto-label">
              마케팅 활용 및 광고성 정보 수신 동의(선택)
            </label>
          </div>
          <div className="checkbox-row">
            <input type="checkbox" className="auto-checkbox" name="autologin"/>
            <label htmlFor="autologin" className="auto-label">
              만 14세 미만 가입 제한(필수)
            </label>
          </div>
          
          <button className="submitBtn">회원가입</button>
        </div>
      </div>

    </div>
  )
}

export default SignUp;