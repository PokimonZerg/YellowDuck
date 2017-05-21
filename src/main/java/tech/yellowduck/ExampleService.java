package tech.yellowduck;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/example")
@Api("example")
public class ExampleService 
{
    @GET
    @Path("/")
    @ApiOperation(value = "Finds Pets by status")
    public String hello()
    {
        return "Hello Duck!!";
    }
}
