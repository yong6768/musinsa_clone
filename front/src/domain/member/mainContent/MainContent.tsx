import React from 'react';
import { Route, Switch } from 'react-router';
import SignIn from './SignIn';

function MainContent() {

  return (
    <Switch>
      <Route exact path="/member/signIn" component={SignIn}/>
    </Switch>
  )
}

export default MainContent;