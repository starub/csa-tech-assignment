package csa.tech.assignment.application.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import csa.tech.assignment.domain.documents.Payment;

@Component
@Profile("PROD")
public class DefaultPaymentManager implements PaymentManager<Payment> {

    @Autowired
    PaymentService service;

    @Override
    public List<Payment> list() {
        return service.list();
    }

}
