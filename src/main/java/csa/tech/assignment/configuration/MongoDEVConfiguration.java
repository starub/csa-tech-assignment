package csa.tech.assignment.configuration;

import org.springframework.context.annotation.Profile;

@Profile("DEV")
public class MongoDEVConfiguration extends DefaultMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "csa_dev";
    }

}
