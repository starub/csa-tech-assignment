package csa.tech.assignment.domain.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import csa.tech.assignment.configuration.MongoTESTConfiguration;
import csa.tech.assignment.domain.documents.Address;
import csa.tech.assignment.domain.documents.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MongoTESTConfiguration.class })
@ActiveProfiles("TEST")
@IntegrationTest
public class CustomerRepositoryIntegrationTest {

    @Autowired
    CustomerRepository repository;

    private Customer customer;

    @Before
    public void setUp() {

        customer = new Customer();

        Address address = new Address();
        address.setAptNumber("1");
        address.setCity("Msida");
        address.setPostCode("MSD1234");
        address.setStreet("Victory str.");

        customer.setAddress(address);

        customer.setFirstName("Scott");
        customer.setLastName("Adams");
        customer.setDateOfBirth(Date.valueOf((LocalDate.of(1982, 12, 20))));
        customer.setEmail("scott@example.com");

        repository.insert(customer);
    }

    @After
    public void tearDown() {
        repository.delete(customer);
    }

    @Test
    public void testCustomerRetrieval() {

        Customer dbCustomer = repository.findByFirstName("Scott");

        assertNotNull(dbCustomer);
        assertEquals(customer, dbCustomer);
    }
}
