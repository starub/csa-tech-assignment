package csa.tech.assignment.domain.dummy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

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
import csa.tech.assignment.domain.documents.Payment;
import csa.tech.assignment.domain.documents.Transaction;
import csa.tech.assignment.domain.documents.types.PaymentType;
import csa.tech.assignment.domain.repositories.PaymentRepository;
import csa.tech.assignment.domain.repositories.TransactionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DefaultMongoConfiguration.class })
@ActiveProfiles("PROD")
@IntegrationTest
public class PreparePaymentDummyData {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @Test
    public void populatePayments() {
        for (int i = 0; i < 20; i++) {
            Payment payment = createPayment();
            paymentRepository.insert(payment);
        }

    }

    private Payment createPayment() {

        Payment payment = new Payment();

        List<Transaction> transactions = transactionRepository.findAll();

        Transaction transaction = transactions.get(RandomUtils.nextInt(0, transactions.size() - 1));

        payment.setAmount(
                new BigDecimal(RandomUtils.nextDouble(10d, 50d)).setScale(2, RoundingMode.HALF_EVEN).doubleValue());

        payment.setCurrency("USD");

        payment.setDescription(RandomStringUtils.random(20, true, false));

        payment.setType(RandomUtils.nextInt(1, 10) > 5 ? PaymentType.GENERAL
                : RandomUtils.nextInt(1, 10) > 7 ? PaymentType.LOAN : PaymentType.MORTGAGE);

        payment.setTransactionId(transaction.getId());

        payment.setCreated(new Date(System.currentTimeMillis()));

        return payment;
    }
}
