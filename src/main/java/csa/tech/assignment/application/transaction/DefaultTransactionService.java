package csa.tech.assignment.application.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import csa.tech.assignment.domain.documents.Transaction;
import csa.tech.assignment.domain.repositories.TransactionRepository;

@Service
@Profile("PROD")
public class DefaultTransactionService implements TransactionService<Transaction> {

    @Autowired
    TransactionRepository repository;

    @Override
    public List<Transaction> list() {
        return repository.findAll();
    }

}
