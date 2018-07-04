package com.pengyd.springboot.controller;





import com.pengyd.springboot.dao.StudentMapper;
import com.pengyd.springboot.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * @Author pengyd
 * @Date 2018/6/12 15:52
 * @function:
 */
@Controller
@RequestMapping("he")
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private StudentMapper studentMapper;


    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${profile.test.username}")
    private String username;



    @RequestMapping("hello")
    public String hello(Model model,@Value("${profile.test.passwrod}")String qq) {
        model.addAttribute("now", new Date());
        System.out.println(username+qq);
        logger.info("进入hello方法");
        return "hello";
    }

    @RequestMapping("tt")
    public String tt(Model model) {
//        studentMapper.insert("pyd","123123","111111111");
        logger.info("插入数据成功！");
        model.addAttribute("now", new Date());
        Student pyd = studentMapper.findUserByName("pyd");
        System.out.println(pyd.toString());
        return "22";
    }


}
