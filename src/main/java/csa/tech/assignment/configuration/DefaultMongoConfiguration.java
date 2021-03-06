package csa.tech.assignment.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Profile("PROD")
@Configuration
@EnableMongoRepositories("csa.tech.assignment.domain.repositories")
public class DefaultMongoConfiguration extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "csa_prod";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }

}
