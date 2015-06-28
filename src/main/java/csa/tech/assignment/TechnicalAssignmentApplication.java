package csa.tech.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TechnicalAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalAssignmentApplication.class, args);
    }
}
