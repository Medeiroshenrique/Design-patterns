package com.pontoevirgulasoftwaresolutions.creators;

import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;
import com.pontoevirgulasoftwaresolutions.products.PaypalProcessor;

public class PaypalFactory extends PaymentFactory{
    @Override
    public PaymentProcessor createProcessor() {
        return new PaypalProcessor();
    }
}
