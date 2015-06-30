package csa.tech.assignment.domain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import csa.tech.assignment.domain.documents.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    List<Payment> findByTransactionId(String transactionId);

}
