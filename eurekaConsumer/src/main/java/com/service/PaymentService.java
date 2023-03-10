package com.service;

import bean.CommonResult;
import bean.Payment;
import com.service.fallback.PaymentServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ming.li
 * @date 2023/3/10 14:11
 */
@Service
@FeignClient(value = "eurekaProducer",fallback = PaymentServiceFallBack.class)
public interface PaymentService {
    @RequestMapping("/producer/create")
    CommonResult create(Payment payment);
    @RequestMapping("/producer/getId")
    CommonResult getId(Long id);

    @RequestMapping("/producer/timeOut")
    CommonResult timeOut();

}
