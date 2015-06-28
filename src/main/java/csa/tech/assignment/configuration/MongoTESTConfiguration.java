package csa.tech.assignment.configuration;

import org.springframework.context.annotation.Profile;

@Profile("TEST")
public class MongoTESTConfiguration extends MongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "csa_test";
    }

}
