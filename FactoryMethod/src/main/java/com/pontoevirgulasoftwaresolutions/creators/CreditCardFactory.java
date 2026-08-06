package com.pontoevirgulasoftwaresolutions.creators;

import com.pontoevirgulasoftwaresolutions.products.CreditCardProcessor;
import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;

public class CreditCardFactory extends PaymentFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}
