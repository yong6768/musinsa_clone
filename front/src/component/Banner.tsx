import React from 'react';
import { Link } from 'react-router-dom';

type BannerProps = {
  image?: String,
  link?: Link
}

function Banner({image, link}: BannerProps) {

  const BannerStyle = {
    width: '100%',
    height: '70px',
    background: `url(${image}) no-repeat center`
  }

  console.log(image, link)
  return (
    <div style={BannerStyle}>

    </div>
  )
}


export default Banner;