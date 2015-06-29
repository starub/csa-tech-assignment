package csa.tech.assignment.application.transaction;

import java.util.List;

public interface TransactionManager<T> {

    List<T> list();
}
