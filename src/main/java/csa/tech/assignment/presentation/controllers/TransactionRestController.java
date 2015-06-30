package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.transaction.TransactionManager;
import csa.tech.assignment.domain.documents.Transaction;

@RestController
@RequestMapping("transaction")
public class TransactionRestController {

    @Autowired
    TransactionManager manager;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Transaction> list() {
        return manager.list();
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public List<Transaction> findByCustomerId(@PathVariable String customerId) {
        return manager.findByCustomerId(customerId);
    }

}
