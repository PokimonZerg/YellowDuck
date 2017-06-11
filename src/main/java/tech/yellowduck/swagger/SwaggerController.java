package tech.yellowduck.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController 
{
    private static final Logger logger = LoggerFactory.getLogger(SwaggerController.class);
    
    @RequestMapping("/swagger")
    public String index() 
    {
        return "swagger/index";
    }
}
