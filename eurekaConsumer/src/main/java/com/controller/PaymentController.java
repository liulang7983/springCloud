package com.controller;

import bean.CommonResult;
import bean.Payment;
import com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming.li
 * @date 2023/3/10 14:27
 */
@RestController
@RequestMapping("/consumer")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        System.out.println("进入consumer/getId");
        return paymentService.create(payment);

    }

    @RequestMapping("/getId")
    public CommonResult getId(@RequestBody Long id){
        System.out.println("进入consumer/getId");
        return paymentService.getId(id);
    }

    @RequestMapping("/timeOut")
    public CommonResult timeOut(){
        System.out.println("进入consumer/timeOut");
        return paymentService.timeOut();
    }
}
