import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import AddressApiController from './components/controllers/AddressApiController';
import ImageLodingEx from './components/controllers/ImageLodingEx';
import ImageLodingwithdataEx from './components/controllers/ImageLodingwithdataEx';
import ImageUploadingEx from './components/controllers/ImageUploadingEx';
import LoginForm from './components/controllers/LoginForm';
import SearchBarController from './components/controllers/SearchBarController';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { CookiesProvider } from 'react-cookie';





ReactDOM.render(

    <React.StrictMode>  
      {/* {/* <SearchBarController/> */}
      <LoginForm/> 

      <AddressApiController/>
      <ImageLodingwithdataEx/>
       {/* <ImageLodingEx/>  */}
      <ImageUploadingEx/>   
    </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
