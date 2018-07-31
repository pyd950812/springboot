package com.pengyd.springboot.entity;

import java.util.Date;

public class Games {
    //游戏主键
    private String id;
    //游戏名字
    private String gameName;
    //游戏类型
    private String gameType;
    //游戏图片地址
    private String imgUrl;
    //游戏简介
    private String gameInformation;
    //游戏大小
    private int gameSize;  //单位M
    //百度云链接地址
    private String bdLinkUrl;
    //百度云密码
    private String bdCode;
    //状态1:可试 0:不可视
    private String gameStatus;
    //其他链接地址
    private String otherUrl;

    private Date createTime;

    private Date updateTime;
    //查看次数
    private int checkCount;

    private String picName;

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getCheckCount() {
        return checkCount;
    }

    public void setCheckCount(int checkCount) {
        this.checkCount = checkCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getGameInformation() {
        return gameInformation;
    }

    public void setGameInformation(String gameInformation) {
        this.gameInformation = gameInformation;
    }

    public int getGameSize() {
        return gameSize;
    }

    public void setGameSize(int gameSize) {
        this.gameSize = gameSize;
    }

    public String getBdLinkUrl() {
        return bdLinkUrl;
    }

    public void setBdLinkUrl(String bdLinkUrl) {
        this.bdLinkUrl = bdLinkUrl;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getOtherUrl() {
        return otherUrl;
    }

    public void setOtherUrl(String otherUrl) {
        this.otherUrl = otherUrl;
    }

    public String getBdCode() {
        return bdCode;
    }

    public void setBdCode(String bdCode) {
        this.bdCode = bdCode;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id='" + id + '\'' +
                ", gameName='" + gameName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", gameInformation='" + gameInformation + '\'' +
                ", gameSize=" + gameSize +
                ", bdLinkUrl='" + bdLinkUrl + '\'' +
                ", bdCode='" + bdCode + '\'' +
                ", gameStatus='" + gameStatus + '\'' +
                ", otherUrl='" + otherUrl + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", checkCount=" + checkCount +
                ", picName='" + picName + '\'' +
                '}';
    }
}
