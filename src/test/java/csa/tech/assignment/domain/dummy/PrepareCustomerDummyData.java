package csa.tech.assignment.domain.dummy;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import csa.tech.assignment.configuration.DefaultMongoConfiguration;
import csa.tech.assignment.domain.documents.Address;
import csa.tech.assignment.domain.documents.Customer;
import csa.tech.assignment.domain.repositories.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DefaultMongoConfiguration.class })
@ActiveProfiles("PROD")
@IntegrationTest
public class PrepareCustomerDummyData {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void populateCustomers() {
        for (int i = 0; i < 20; i++) {
            Customer customer = createCustomer();
            customerRepository.insert(customer);
        }
    }

    private Customer createCustomer() {

        Customer customer = new Customer();

        Address address = new Address();

        address.setAptNumber(String.valueOf(RandomUtils.nextInt(1, 100)));
        address.setCity(RandomStringUtils.random(6, true, false));
        address.setPostCode(RandomStringUtils.random(3, true, false));
        address.setStreet(RandomStringUtils.random(10, true, true));

        customer.setAddress(address);
        customer.setCreated(new Date(System.currentTimeMillis()));

        int year = RandomUtils.nextInt(1980, 2000);
        int dayOfYear = RandomUtils.nextInt(1, 365);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
        Date dateOfBirth = calendar.getTime();

        customer.setDateOfBirth(dateOfBirth);
        customer.setEmail(RandomStringUtils.random(5, true, true).concat("@example.com"));
        customer.setFirstName(RandomStringUtils.random(10, true, false));
        customer.setLastName(RandomStringUtils.random(10, true, false));
        customer.setMiddleName(RandomUtils.nextInt(1, 10) > 5 ? "Mr" : "Ms");

        return customer;
    }
}
