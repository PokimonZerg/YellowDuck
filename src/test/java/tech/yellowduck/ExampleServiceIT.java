package tech.yellowduck;

import java.net.URL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ExampleServiceIT
{
    @ArquillianResource
    protected URL webappUrl;

    @Test
    @RunAsClient
    public void hello()
    {
        int i = 0;
    }

    @Deployment
    public static WebArchive createDeployment() throws Exception
    {
         return ShrinkWrap.create(WebArchive.class)
                .addAsLibraries(Maven.configureResolver()
                        .loadPomFromFile("pom.xml", System.getProperty("maven.profile"))
                        .importRuntimeDependencies()
                        .resolve()
                        .withTransitivity()
                        .asFile())
                .addPackages(true, YellowDuckApplication.class.getPackage());
    }
}
