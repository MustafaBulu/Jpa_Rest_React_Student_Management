import logo from './logo.svg';
import './App.css';
import React from 'react';
import ListStudentComponent from './components/ListStudentComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

function App() {
  return (
    <div>
      <HeaderComponent/>
        <div className="container">
         <ListStudentComponent/>
        </div>
      <FooterComponent/>
    </div>
  );
}

export default App;
