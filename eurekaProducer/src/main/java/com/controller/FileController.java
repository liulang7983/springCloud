package com.controller;

import bean.CommonResult;
import com.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
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
    private FileService fileService;
    //微服务文件传输是@RequestPart
    @RequestMapping("add")
    public CommonResult add(@RequestPart("file") MultipartFile file){

        System.out.println("我收到了文件");
        return fileService.add(file);
    }
    @RequestMapping("base64")
    public CommonResult base64(@RequestParam("base64")String base64){

        System.out.println("我收到了base64文件:"+base64);
        return fileService.base64(base64);
    }
}
