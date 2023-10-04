package org.acme;

import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

@ConfigProperty(name = "pw2.message",  defaultValue="" )
String message;

@ConfigProperty(name = "pw2.name")
Optional<String> name;

@GET
@Produces(MediaType.TEXT_PLAIN)
public String hello() {
    return message + " " + name.orElse("world");
}

}
