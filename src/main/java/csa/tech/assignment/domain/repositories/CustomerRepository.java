package csa.tech.assignment.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import csa.tech.assignment.domain.documents.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
