package tech.yellowduck;

import io.swagger.jaxrs.config.BeanConfig;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationScoped
@ApplicationPath("/api")
public class YellowDuckApplication extends Application
{
    @Inject
    private ApplicationConfiguration configuration;

    public YellowDuckApplication()
    {
    }

    @PostConstruct
    public void init()
    {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("LATEST");
        beanConfig.setSchemes(new String[] { "http", "https" });
        beanConfig.setTitle("My API");
        beanConfig.setBasePath(configuration.getContextPath() + "/api");
        beanConfig.setResourcePackage("tech.yellowduck");
        beanConfig.setScan(true);
    }

    @Override
    public Set<Class<?>> getClasses() 
    {
        return new HashSet<Class<?>>()
        {{
                    add(ExampleService.class);
                    add(io.swagger.jaxrs.listing.ApiListingResource.class);
                    add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        }};
    }
}
