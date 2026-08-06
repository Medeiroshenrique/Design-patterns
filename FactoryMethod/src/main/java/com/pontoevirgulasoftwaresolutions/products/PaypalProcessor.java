package com.pontoevirgulasoftwaresolutions.products;

import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;

import java.util.UUID;

public class PaypalProcessor implements PaymentProcessor{
    @Override
    public PaymentResult process(Payment payment) {
        return new PaymentResult(
                true,
                UUID.randomUUID().toString(),
                "Paypal payment completed.",
                "PAYPAL"
        );
    }

    private void authenticate(){
        System.out.println("Authenticating with PayPal...");
    }

    private  void redirectCustomer(){
        System.out.println("Redirecting customer...");
    }

    private void confirmPayment(){
        System.out.println("Confirming payment...");
    }
}
