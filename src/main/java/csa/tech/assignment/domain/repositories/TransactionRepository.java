package csa.tech.assignment.domain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import csa.tech.assignment.domain.documents.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

    List<Transaction> findByCustomerId(String customerId);

}
