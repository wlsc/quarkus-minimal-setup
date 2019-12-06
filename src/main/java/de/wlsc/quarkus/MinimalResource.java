package de.wlsc.quarkus;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class MinimalResource {

  @GET
  @Path("/hello")
  @Produces(APPLICATION_JSON)
  public String hello() {
    return "hello world";
  }
}