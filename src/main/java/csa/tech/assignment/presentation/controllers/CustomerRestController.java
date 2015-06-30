package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.customer.CustomerManager;
import csa.tech.assignment.domain.documents.Customer;

@RestController
@RequestMapping("customer")
public class CustomerRestController {

    @Autowired
    CustomerManager manager;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Customer> list() {
        return manager.list();
    }
    
    @RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
    public Customer findByFirstName(@PathVariable String firstName) {
        return manager.findByFirstName(firstName);
    }
}
