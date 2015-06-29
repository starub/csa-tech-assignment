package csa.tech.assignment.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import csa.tech.assignment.application.payment.PaymentManager;
import csa.tech.assignment.domain.documents.Payment;

@RestController
@RequestMapping("payment")
public class PaymentRestController {

    @Autowired
    PaymentManager manager;

    @RequestMapping("list")
    public List<Payment> list() {
        return manager.list();
    }

}
