package csa.tech.assignment.application.transaction;

import java.util.List;

public interface TransactionService<T> {

    List<T> list();
    
}
