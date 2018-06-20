package com.pengyd.springboot.Listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author pengyd
 * @Date 2018/6/20 14:36
 * @function:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        //配置事件监听器
        springApplication.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = springApplication.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.close();
    }
}
