package csa.tech.assignment.domain.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import csa.tech.assignment.domain.repositories.CustomerRepositoryIntegrationTest;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses(CustomerRepositoryIntegrationTest.class)
public class IntegrationTestSuite extends TestSuite {

}
