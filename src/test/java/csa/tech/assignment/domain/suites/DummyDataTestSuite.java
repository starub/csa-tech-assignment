package csa.tech.assignment.domain.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import csa.tech.assignment.domain.dummy.PrepareCustomerDummyData;
import csa.tech.assignment.domain.dummy.PreparePaymentDummyData;
import csa.tech.assignment.domain.dummy.PrepareTransactionDummyData;

@RunWith(Suite.class)
@SuiteClasses({ PrepareCustomerDummyData.class, PrepareTransactionDummyData.class, PreparePaymentDummyData.class })
public class DummyDataTestSuite {

}
