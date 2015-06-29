package csa.tech.assignment.application.customer;

import java.util.List;

public interface CustomerService<T> {

    List<T> list();
}
