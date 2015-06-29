package csa.tech.assignment.presentation.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import csa.tech.assignment.application.customer.CustomerManager;

@Component
public class CustomerRoute extends RouteBuilder {

    @Autowired
    ApplicationContext context;

    @Override
    public void configure() throws Exception {

        CustomerManager manager = context.getBean(CustomerManager.class);

        from("restlet:http://localhost:8081/services/camel/customer?restletMethod=GET").process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {

                exchange.getOut().setBody(manager.list());
            }
        }).to("log:".concat(CustomerRoute.class.getName()));

    }
}
