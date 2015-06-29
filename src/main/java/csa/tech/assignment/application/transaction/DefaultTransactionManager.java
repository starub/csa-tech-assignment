package csa.tech.assignment.application.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import csa.tech.assignment.domain.documents.Transaction;

@Component
@Profile("PROD")
public class DefaultTransactionManager implements TransactionManager<Transaction> {

    @Autowired
    TransactionService service;

    @Override
    public List<Transaction> list() {
        return service.list();
    }

}
