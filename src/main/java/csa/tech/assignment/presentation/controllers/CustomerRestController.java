package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.customer.CustomerManager;
import csa.tech.assignment.domain.documents.Customer;

@RestController
@RequestMapping("customer")
public class CustomerRestController {

    @Autowired
    CustomerManager manager;

    @RequestMapping("list")
    public List<Customer> list() {
        return manager.list();
    }
}
