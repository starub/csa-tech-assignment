package csa.tech.assignment.application.payment;

import java.util.List;

import csa.tech.assignment.domain.documents.Payment;

public interface PaymentManager {

    List<Payment> list();

    List<Payment> findByTransactionId(String transactionId);
    
}
