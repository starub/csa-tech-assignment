package csa.tech.assignment.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import csa.tech.assignment.domain.documents.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
