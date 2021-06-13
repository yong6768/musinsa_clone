import React from 'react';
import { Route, Switch } from 'react-router';

import News from './News';

function MagazineMainContent() {

  return (
    <Switch>
      <Route path="/magazines/news" component={News}/>
    </Switch>
  )
}

export default MagazineMainContent;