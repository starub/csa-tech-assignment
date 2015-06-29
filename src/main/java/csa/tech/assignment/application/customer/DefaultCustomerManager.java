package csa.tech.assignment.application.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import csa.tech.assignment.domain.documents.Customer;

@Component
@Profile("PROD")
public class DefaultCustomerManager implements CustomerManager<Customer> {

    @Autowired
    CustomerService service;
    
    @Override
    public List<Customer> list() {
        return service.list();
    }

}
