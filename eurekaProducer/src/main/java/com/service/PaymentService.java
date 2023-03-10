package com.service;

import bean.Payment;

/**
 * @author ming.li
 * @date 2023/3/10 14:11
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getId(Long id);
    String timeOut();
}
