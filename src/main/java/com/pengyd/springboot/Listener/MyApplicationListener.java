package com.pengyd.springboot.Listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author pengyd
 * @Date 2018/6/20 14:33
 * @function:
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent>{

    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {

        System.out.println("接收到时间："+myApplicationEvent.getClass());
    }
}
