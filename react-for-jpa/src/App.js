import './App.css';
import React from 'react';
import { BrowserRouter as Router,Route, Routes } from 'react-router-dom';
import ListStudentComponent from './components/ListStudentComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateStudentComponent from './components/CreateStudentComponent';

function App() {
  return (
    <div>
      <Router>
        <HeaderComponent />
          <div className='container'>
              <div className="container">
                  <Routes>            
                      <Route path = "/" element = {<ListStudentComponent />}> </Route>
                      <Route path = "/students" element = {<ListStudentComponent />}> </Route>
                      <Route path = "/add-students" element = {<CreateStudentComponent />}> </Route>
                      
                  </Routes>                      
              </div>   
          </div>
        <FooterComponent />
      </Router>
    </div>
  );
}

export default App;