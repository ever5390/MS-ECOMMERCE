package com.erosalesp.ecommerce.kafka;


import com.erosalesp.ecommerce.customer.CustomerResponse;
import com.erosalesp.ecommerce.order.PaymentMethod;
import com.erosalesp.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
