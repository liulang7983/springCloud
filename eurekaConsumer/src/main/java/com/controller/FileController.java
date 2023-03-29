package com.controller;

import bean.CommonResult;
import com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ming.li
 * @date 2023/3/29 15:02
 */
@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("add")
    public CommonResult add(@RequestParam("file") MultipartFile file){
        return paymentService.add(file);
    }
}
