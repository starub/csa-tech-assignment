package csa.tech.assignment.application.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import csa.tech.assignment.domain.documents.Payment;
import csa.tech.assignment.domain.repositories.PaymentRepository;

@Service
@Profile("PROD")
public class DefaultPaymentService implements PaymentService<Payment> {

    @Autowired
    PaymentRepository repository;

    @Override
    public List<Payment> list() {
        return repository.findAll();
    }

}
