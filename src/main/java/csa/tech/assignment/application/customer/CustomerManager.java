package csa.tech.assignment.application.customer;

import java.util.List;

import csa.tech.assignment.domain.documents.Customer;

public interface CustomerManager {

    List<Customer> list();

    Customer findByFirstName(String firstName);

}
