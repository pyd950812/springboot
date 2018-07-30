package com.pengyd.springboot.entity;

import java.util.Date;

public class Films {

    //游戏主键
    private String id;
    //游戏名字
    private String filmName;
    //游戏类型
    private String filmType;
    //游戏图片地址
    private String imgUrl;
    //游戏简介
    private String movieInformation;
    //游戏大小
    private int movieSize;
    //百度云链接地址
    private String bdLinkUrl;
    //状态1:可试 0:不可视
    private String movieStatus;
    //其他链接地址
    private String otherUrl;
    //演员名称
    private String actorName;

    private Date createTime;

    private Date updateTime;
    //查看次数
    private int checkCount;

}
