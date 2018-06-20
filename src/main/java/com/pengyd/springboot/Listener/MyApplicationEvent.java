package com.pengyd.springboot.Listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author pengyd
 * @Date 2018/6/20 14:28
 * @function:
 */
public class MyApplicationEvent extends ApplicationEvent{

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
