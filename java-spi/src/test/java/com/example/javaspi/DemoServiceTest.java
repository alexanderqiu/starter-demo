package com.example.javaspi;

import java.util.ServiceLoader;

/**
 * 〈demo service test〉
 *
 * @author long
 * @date 2020/1/20 11:58 上午
 * @since 1.0.0
 */
public class DemoServiceTest {

    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        for (DemoService demoService : serviceLoader) {
            System.out.println(
                    demoService.getClass().getSimpleName() + "-" + demoService.say("LiLei"));
        }
    }

}
