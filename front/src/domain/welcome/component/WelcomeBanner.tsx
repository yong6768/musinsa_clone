import React from 'react';
import Slider from "react-slick";

function WelcomeBanner() {

  const sliderSetting = {
    dots: true, 
    infinite: true,
    speed: 500,
    arrows: false,
    autoplay: true,
    autoplaySpeed: 2750,
  }
  return(
    <div className="main-content-banner">
      <Slider {...sliderSetting}>
        <div>
            <h3>1</h3>
          </div>
          <div>
            <h3>2</h3>
          </div>
          <div>
            <h3>3</h3>
          </div>
          <div>
            <h3>4</h3>
          </div>
          <div>
            <h3>5</h3>
          </div>
          <div>
            <h3>6</h3>
          </div>
      </Slider>
    </div>
  )
}

export default WelcomeBanner;