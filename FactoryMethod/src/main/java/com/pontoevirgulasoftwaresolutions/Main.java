package com.pontoevirgulasoftwaresolutions;

import com.pontoevirgulasoftwaresolutions.creators.PaymentFactory;
import com.pontoevirgulasoftwaresolutions.creators.PixFactory;
import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;
import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;

import java.math.BigDecimal;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Payment payment = new Payment(
                UUID.randomUUID(),
                "Henrique Medeiros",
                "henrique@email.com",
                new BigDecimal("199.90"),
                "Java Design Patterns Course",
                "BRL"
        );

        PaymentFactory factory = new PixFactory();
        PaymentProcessor processor = factory.createProcessor();
        processor.process(payment);

        PaymentResult result = processor.process(payment);
        System.out.println(result);
    }


}
