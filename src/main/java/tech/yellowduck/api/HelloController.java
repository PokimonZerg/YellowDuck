package tech.yellowduck.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class HelloController 
{
    @ApiOperation("Say hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() 
    {
        return "Hello Spring!";
    }
}
