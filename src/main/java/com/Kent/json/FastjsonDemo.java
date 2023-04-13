package com.Kent.json;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class FastjsonDemo {
    public static void main(String[] args) {
        // 1. 將 java 物件轉為 JSON　字串
        User user = new User();
        user.setId(1);
        user.setUsername("小明");
        user.setPassword("123");

        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString); //{"id":1,"password":"123","username":"小明"}

        // 2. 將 JSON 字串轉為 JAVA 物件
        User u = JSON.parseObject("{\"id\":1,\"password\":\"123\",\"username\":\"小明\"}", User.class);
        System.out.println(u); // User{id=1, username='小明', password='123'}

    }
}
