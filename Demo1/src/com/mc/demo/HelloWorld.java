package com.mc.demo;

import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        HashMap<String, String> map = new HashMap<>();
        map.put("小明","一个人");
        map.put("小伟","在这个夜里");
        map.put("小王","寂寞到难以入睡");
        System.out.println(map);


    }
}
