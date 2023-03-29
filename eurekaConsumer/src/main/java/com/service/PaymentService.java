package com.service;

import bean.CommonResult;
import bean.Payment;
import com.service.fallback.PaymentServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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

    //微服务文件传输是@RequestPart
    @RequestMapping(value = "/file/add",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    CommonResult add(@RequestPart("file") MultipartFile file);

}
