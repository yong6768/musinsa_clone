import React from 'react';
import { Route, Switch } from 'react-router';
import NewsList from './List';

function MainContent() {

  return (
    <Switch>
      <Route exact path="" component={NewsList}/>
    </Switch>
  )
}

export default MainContent;