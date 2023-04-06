package com.bean;

/**
 * @author ming.li
 * @date 2023/4/6 19:45
 */
public class Message {
    private String code;
    private String msg;

    public Message(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
