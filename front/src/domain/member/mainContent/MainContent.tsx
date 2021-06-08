import React from 'react';
import { Route, Switch } from 'react-router';
import SignIn from './SignIn';
import SignUp from './SignUp';

function MainContent() {

  return (
    <Switch>
      <Route exact path="/member/signIn" component={SignIn}/>
      <Route exact path="/member/signUp" component={SignUp}/>
    </Switch>
  )
}

export default MainContent;