package com.pontoevirgulasoftwaresolutions.products;

import com.pontoevirgulasoftwaresolutions.models.Payment;
import com.pontoevirgulasoftwaresolutions.models.PaymentResult;

public interface PaymentProcessor {
    PaymentResult process(Payment payment);
}
