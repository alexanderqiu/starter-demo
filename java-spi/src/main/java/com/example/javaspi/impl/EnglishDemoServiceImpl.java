package com.example.javaspi.impl;

import com.example.javaspi.DemoService;

/**
 * 〈英语〉
 *
 * @author long
 * @date 2020/1/20 11:53 上午
 * @since 1.0.0
 */
public class EnglishDemoServiceImpl implements DemoService {

    @Override
    public String say(String name) {
        return "hello:" + name;
    }

}
