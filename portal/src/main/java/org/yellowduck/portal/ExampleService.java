package org.yellowduck.portal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class ExampleService 
{
    @GET
    public String hello()
    {
        return "Hello Duck!";
    }
}
