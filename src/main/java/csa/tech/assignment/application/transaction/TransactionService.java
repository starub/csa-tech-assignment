package csa.tech.assignment.application.transaction;

import java.util.List;

import csa.tech.assignment.domain.documents.Transaction;

public interface TransactionService {

    List<Transaction> list();

    List<Transaction> findByCustomerId(String customerId);

}
