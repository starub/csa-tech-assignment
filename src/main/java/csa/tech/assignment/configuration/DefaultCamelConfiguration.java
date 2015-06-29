package csa.tech.assignment.configuration;

import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import csa.tech.assignment.presentation.routes.CustomerRoute;

@Profile("PROD")
@Configuration
public class DefaultCamelConfiguration extends CamelConfiguration {

    @Autowired
    CustomerRoute customerRoute;

}
