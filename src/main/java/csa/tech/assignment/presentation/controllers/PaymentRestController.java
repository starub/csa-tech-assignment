package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.payment.PaymentManager;
import csa.tech.assignment.domain.documents.Payment;

@RestController
@RequestMapping("payment")
public class PaymentRestController {

    @Autowired
    PaymentManager manager;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Payment> list() {
        return manager.list();
    }

    @RequestMapping(value = "/{transactionId}", method = RequestMethod.GET)
    public List<Payment> findByCustomerId(@PathVariable String transactionId) {
        return manager.findByTransactionId(transactionId);
    }
}
