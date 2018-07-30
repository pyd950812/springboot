package com.pengyd.springboot.entity;

public class FilmType {

    private int id;
    //游戏类型名称
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
