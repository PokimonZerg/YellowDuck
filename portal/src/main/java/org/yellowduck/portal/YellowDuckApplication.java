package org.yellowduck.portal;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class YellowDuckApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses() 
    {
        return new HashSet<Class<?>>()
        {{
                    add(ExampleService.class);
        }};
    }
}
