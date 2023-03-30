package com.service;

import bean.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author ming.li
 * @date 2023/3/29 15:05
 */

public interface FileService {
    CommonResult add(@RequestParam("file") MultipartFile file);

    CommonResult base64(String base64);
}
