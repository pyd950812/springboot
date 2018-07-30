package com.pengyd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author pengyd
 * @Date 2018/7/27 17:08
 * @function:
 */
public class EasyDeployWarApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EasyDeployWarApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EasyDeployWarApplication.class,args);
    }

}
