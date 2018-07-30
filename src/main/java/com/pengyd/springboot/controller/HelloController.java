package com.pengyd.springboot.controller;


import com.pengyd.springboot.dao.StudentDao;
import com.pengyd.springboot.entity.Games;
import com.pengyd.springboot.entity.Student;
import com.pengyd.springboot.service.GamesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Author pengyd
 * @Date 2018/6/12 15:52
 * @function:
 */
@Controller
@RequestMapping("resources")
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private GamesService gamesService;

    /**
     * 跳转index页面
     *
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String index(Model model) {
        System.out.println("===============index");
        List<Games> hotList = gamesService.queryMostHotGames();
        List<Games> lastedList = gamesService.queryLastGames();
        List<Games> largeList = gamesService.queryLargeSizeGames();
        Games games = gamesService.queryRecommendGames();
        model.addAttribute("hotList", hotList);
        model.addAttribute("lastedList", lastedList);
        model.addAttribute("largeList", largeList);
        model.addAttribute("games", games);
        return "index";
    }

    /**
     * 跳转about页面
     *
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
     *
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
     *
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
     *
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
     *
     * @param model
     * @return
     */
    @RequestMapping("contact")
    public String contact(Model model) {
        System.out.println("contact");
        return "contact";
    }


}
