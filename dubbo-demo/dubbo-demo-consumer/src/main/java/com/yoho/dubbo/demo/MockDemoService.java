package com.yoho.dubbo.demo;

import com.alibaba.dubbo.demo.DemoService;

/**
 * Author:yanzhang.fu
 * Date:2018/6/13
 * Description:
 * Modified By：
 **/
public class MockDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("这是一个mock。。。");
        return "mock";
    }
}
