import React from 'react';
import { useParams } from 'react-router-dom';

const StyledWord = () => {
  const { word, textColor, bgColor } = useParams();
  const style = {
    color: textColor,
    backgroundColor: bgColor,
    padding: '10px',
  };

  return <h1 style={style}>The word is: {word}</h1>;
};

export default StyledWord;
