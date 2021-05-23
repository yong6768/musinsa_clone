import React from 'react';
import { Route } from 'react-router-dom';

import Welcome from './domain/welcome/Welcom';

function Router() {

  return(
    <div>
      <Route exact path="/" component={Welcome}/>
    </div>
  )

}

export default Router;