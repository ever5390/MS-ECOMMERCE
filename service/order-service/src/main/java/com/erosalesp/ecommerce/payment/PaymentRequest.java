package com.erosalesp.ecommerce.payment;

import com.erosalesp.ecommerce.customer.CustomerResponse;
import com.erosalesp.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
