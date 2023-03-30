package com.service.impl;

import bean.CommonResult;
import cn.hutool.core.codec.Base64Decoder;
import com.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Base64;

/**
 * @author ming.li
 * @date 2023/3/29 15:10
 */
@Service
public class FileServiceImpl implements FileService {
    @Override
    public CommonResult add(MultipartFile file){
        try {
            InputStream ins = file.getInputStream();
            File file1 = new File("D:\\李明\\租赁物\\租后排重\\a.txt");

            inputStreamToFile(ins,file1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new CommonResult(200, "文件写入成功");
    }

    @Override
    public CommonResult base64(String base64) {
        try {
            byte[] bytes = new BASE64Decoder().decodeBuffer(base64);
            FileOutputStream stream = new FileOutputStream(new File("D:\\李明\\租赁物\\租后排重\\base64.txt"));
            stream.write(bytes);
            stream.close();;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new CommonResult(200, "base64转换文件成功");
    }

    /**
     * 流写入文件
     *
     * @param inputStream 文件输入流
     * @param file        输出文件
     */
    private static void inputStreamToFile(InputStream inputStream, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
