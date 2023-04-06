package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ming.li
 * @date 2023/4/6 19:28
 */
@Controller
public class PageController {

    /**
     * 页面跳转方法
     */
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }

}
