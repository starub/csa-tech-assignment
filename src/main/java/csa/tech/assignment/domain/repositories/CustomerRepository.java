package csa.tech.assignment.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import csa.tech.assignment.domain.documents.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);
}
