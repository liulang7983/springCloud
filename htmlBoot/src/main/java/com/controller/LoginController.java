package com.controller;

import com.bean.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ming.li
 * @date 2023/4/6 19:19
 */
@RestController
@RequestMapping("/index")
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public Message login(String name, String password , HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Methods","*");
        System.out.println("进入");
        //假设数据库中存在一个账户为：admin,123456
        if(name.equals("admin")&&password.equals("123456")){
            return new Message("200","成功");
        }
        return new Message("400","失败");
    }
}
