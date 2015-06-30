package csa.tech.assignment.domain.dummy;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import csa.tech.assignment.configuration.DefaultMongoConfiguration;
import csa.tech.assignment.domain.documents.Customer;
import csa.tech.assignment.domain.documents.Transaction;
import csa.tech.assignment.domain.documents.types.TransactionType;
import csa.tech.assignment.domain.repositories.CustomerRepository;
import csa.tech.assignment.domain.repositories.TransactionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DefaultMongoConfiguration.class })
@ActiveProfiles("PROD")
@IntegrationTest
public class PrepareTransactionDummyData {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    TransactionRepository transactionRepository;

    @Test
    public void populateTransactions() {
        for (int i = 0; i < 20; i++) {
            Transaction transaction = createTransaction();
            transactionRepository.insert(transaction);
        }
    }

    private Transaction createTransaction() {

        List<Customer> customers = customerRepository.findAll();

        Customer customer = customers.get(RandomUtils.nextInt(0, customers.size() - 1));

        Transaction transaction = new Transaction();

        transaction.setCustomerId(customer.getId());
        transaction.setCreated(new Date(System.currentTimeMillis()));
        transaction.setType(RandomUtils.nextInt(1, 10) > 5 ? TransactionType.INTERNAL : TransactionType.EXTERNAL);

        return transaction;
    }
}

