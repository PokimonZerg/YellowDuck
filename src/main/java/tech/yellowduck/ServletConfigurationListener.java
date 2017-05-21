package tech.yellowduck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletConfigurationListener implements ServletContextListener
{
    private static final Logger logger = LoggerFactory.getLogger(ServletConfigurationListener.class);

    @Inject
    private ApplicationConfiguration configuration;

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        configuration.setContextPath(sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {

    }
}
