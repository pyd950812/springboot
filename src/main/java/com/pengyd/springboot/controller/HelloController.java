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
import org.springframework.web.servlet.ModelAndView;

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


    /**
     * 跳转index页面
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String index(Model model) {
        System.out.println("index");
        return "index";
    }

    /**
     * 跳转about页面
     * @param model
     * @return
     */
    @RequestMapping("about")
    public String about(Model model) {
        System.out.println("about");
        return "about";
    }


    /**
     * 跳转reviews页面
     * @param model
     * @return
     */
    @RequestMapping("reviews")
    public String reviews(Model model) {
        System.out.println("reviews");
        return "reviews";
    }


    /**
     * 跳转typo页面
     * @param model
     * @return
     */
    @RequestMapping("typo")
    public String typo(Model model) {
        System.out.println("typo");
        return "typo";
    }


    /**
     * 跳转gallery页面
     * @param model
     * @return
     */
    @RequestMapping("gallery")
    public String gallery(Model model) {
        System.out.println("gallery");
        return "gallery";
    }


    /**
     * 跳转contact页面
     * @param model
     * @return
     */
    @RequestMapping("contact")
    public String contact(Model model) {
        System.out.println("contact");
        return "contact";
    }




}
