import React from 'react';
import { Route, Switch } from 'react-router-dom';

import Welcome from './domain/welcome/Welcom';
// import Magazine from './domain/magazines/Magazine';
import News from './domain/news/News';
import Member from './domain/member/Member';

function Router() {

  return(
    <Switch>
      <Route exact path="/" component={Welcome}/>
      <Route path="/news" component={News}/>
      <Route path="/member" component={Member}/>
      {/* <Route path="/magazines/:type" component={Magazine}/> */}


    </Switch>
  )
}

export default Router;