package com.yoho.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author:yanzhang.fu
 * Date:2018/5/31
 * Description:
 * Modified By：
 **/
public class YohoProvider {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/yoho-dubbo-demo-provider.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }
}
