package csa.tech.assignment.presentation.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import csa.tech.assignment.application.customer.CustomerManager;
import csa.tech.assignment.domain.documents.Customer;

@Component
public class CustomerRoute extends RouteBuilder {

    @Autowired
    ApplicationContext context;

    @Override
    public void configure() throws Exception {

        restConfiguration()

        .component("restlet").port(8081).bindingMode(RestBindingMode.json);

        CustomerManager manager = context.getBean(CustomerManager.class);

        rest("/services/camel/customer").consumes("application/json").produces("application/json")

        .get().outType(Customer[].class).route().process(new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                exchange.getOut().setBody(manager.list());
            }

        }).to("log:".concat(CustomerRoute.class.getName()));
    }
}
