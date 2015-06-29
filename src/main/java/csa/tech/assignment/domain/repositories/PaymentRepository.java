package csa.tech.assignment.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import csa.tech.assignment.domain.documents.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

}
