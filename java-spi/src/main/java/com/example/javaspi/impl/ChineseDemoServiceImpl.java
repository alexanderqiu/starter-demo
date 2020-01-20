package com.example.javaspi.impl;

import com.example.javaspi.DemoService;

/**
 * 〈普通话〉
 *
 * @author long
 * @date 2020/1/20 11:50 上午
 * @since 1.0.0
 */
public class ChineseDemoServiceImpl implements DemoService {

    @Override
    public String say(String name) {
        return "你好:" + name;
    }

}
