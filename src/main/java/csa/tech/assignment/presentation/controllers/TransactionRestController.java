package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.transaction.TransactionManager;
import csa.tech.assignment.domain.documents.Customer;

@RestController
@RequestMapping("transaction")
public class TransactionRestController {

    @Autowired
    TransactionManager manager;

    @RequestMapping("list")
    public List<Customer> list() {
        return manager.list();
    }

}
