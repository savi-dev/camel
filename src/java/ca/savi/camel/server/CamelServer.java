// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.server;

import java.io.IOException;

import ca.savi.camel.service.AORResourceServiceImpl;
import ca.savi.front.FrontServer;

/**
* Runs the front server for cheeta.
*
* @author Soheil Hassas Yeganeh <soheil@cs.toronto.edu>
*/

public class CamelServer {
  public static void main(String[] args) throws IOException {
   FrontServer f = new FrontServer("0.0.0.0", 9876, false);
   f.register(AORResourceServiceImpl.class);
   f.start();
  }
}