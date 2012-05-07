// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.server;

import java.io.IOException;

import ca.savi.camel.service.AORResourceService;
import ca.savi.front.FrontServer;

/**
* Runs the front server for camel.
*
* @author Eliot J. Kang <eliot@savinetwork.ca>
* @version 0.3
*/

public class CamelServer {
  public static void main(String[] args) throws IOException {
   FrontServer f = new FrontServer("0.0.0.0", 9876, false);
   f.register(AORResourceService.class);
   f.start();
  }
}