import React from 'react';

function Footer() {

  return (
    <div className="footer">
      <div className="clone-title">
        무신사 클론
      </div>

      <div className="row1 row">
        <div className="clone-developer-wrapper clearfix">
          <div className="clone-developer">
            <p className="developer">김용민</p>
            <p className="role">서버(JAVA, Spring Boot)<br/>프론트(TypeScript, React)</p>
          </div>
          <div className="clone-developer">
            <p className="developer">최지웅</p>
            <p className="role">서버(JAVA, Spring Boot)<br/>프론트(TypeScript, React)</p>
          </div>
          <div className="clone-developer">
            <p className="developer">강현준</p>
            <p className="role">서버(JAVA, Spring Boot)<br/>프론트(JAVA, Thymeleaf)</p>
          </div>
        </div>

      </div>
      <div className="row2 row">
        
      </div>
      <div className="row3 row">
        
      </div>
    </div>
  )
}

export default Footer;