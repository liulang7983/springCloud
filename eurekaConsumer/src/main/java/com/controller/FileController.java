package com.controller;

import bean.CommonResult;
import cn.hutool.core.codec.Base64Decoder;
import cn.hutool.core.codec.Base64Encoder;
import com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.InputStream;

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

    @RequestMapping("/base64")
    public CommonResult base64(@RequestParam("file") MultipartFile file){
        byte[] data=null;
        try {
            InputStream inputStream = file.getInputStream();
            System.out.println("文件大小:"+inputStream.available());
            data=new byte[inputStream.available()];
            inputStream.read(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(data);

        return paymentService.base64(encode);
    }
}
