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
 * @date 2023/3/10 14:13
 */
@RestController
@RequestMapping("/producer")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        System.out.println("进入producer/create");
        int i = paymentService.create(payment);
        if (i > 0) {
            return new CommonResult(200, "插入成功", i);
        }
        return new CommonResult(400, "插入失败", null);
    }

    @RequestMapping("/getId")
    public CommonResult getId(@RequestBody Long id){
        System.out.println("进入producer/getId");
        Payment payment = paymentService.getId(id);
        return new CommonResult(200, "查询成功", payment);
    }

    @RequestMapping("/timeOut")
    public CommonResult timeOut(){
        System.out.println("进入producer/timeOut");
        String s = paymentService.timeOut();
        return new CommonResult(200, "查询成功", s);
    }

    @RequestMapping("/getIdInt")
        public CommonResult getIdInt(){
        System.out.println("进入producer/getId");
        Payment payment = paymentService.getId(null);
        return new CommonResult(200, "查询成功", payment);
    }


}
