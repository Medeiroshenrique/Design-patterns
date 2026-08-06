package com.pontoevirgulasoftwaresolutions.products;

import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;

import java.sql.SQLOutput;
import java.util.UUID;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public PaymentResult process(Payment payment) {
        return new PaymentResult(
                true,
        UUID.randomUUID().toString(),
        "Credit card payment approved.",
        "CREDIT_CARD"
        );
    }

    private void validateCard(){
        System.out.println("Validating card...");
    }

    private void authorizedCard(){
        System.out.println("Authorizing payment...");
    }

    private void capturePayment(){
        System.out.println("Capturing payment...");
    }
}
