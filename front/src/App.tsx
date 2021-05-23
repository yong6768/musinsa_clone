import React from 'react';
import { BrowserRouter } from 'react-router-dom';

import './App.scss';

import AppRoutere from './AppRouter';

function App() {
  return (
    <BrowserRouter>
      <AppRoutere/>
    </BrowserRouter>
  );
}

export default App;
