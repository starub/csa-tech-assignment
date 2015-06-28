package csa.tech.assignment.domain.repositories;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.annotation.Profile;

import csa.tech.assignment.domain.documents.Customer;

@RunWith(MockitoJUnitRunner.class)
@Profile("DEV")
public class CustomerRepositoryUnitTest {

    @Mock
    CustomerRepository repository;

    @Mock
    Customer customer;

    @Before
    public void setUp() {
        when(repository.findByFirstName(eq("Scott"))).thenReturn(customer);
    }

    @Test
    public void testFindByFirstName() {
        Customer mocked = repository.findByFirstName("Scott");
        assertNotNull(mocked);
    }

}
