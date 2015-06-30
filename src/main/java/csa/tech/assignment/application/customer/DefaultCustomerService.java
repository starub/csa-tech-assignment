package csa.tech.assignment.application.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import csa.tech.assignment.domain.documents.Customer;
import csa.tech.assignment.domain.repositories.CustomerRepository;

@Service
@Profile("PROD")
public class DefaultCustomerService implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> list() {
        return repository.findAll();
    }

    @Override
    public Customer findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

}
