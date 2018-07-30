package com.pengyd.springboot.util;

public enum  FilmConfig {


    LOVE_TYPE(0,"爱情"),
    ACTING_TYPE(1,"动作"),
    HORROR_TYPE(2,"惊悚"),
    COMEDY_TYPE(3,"喜剧"),
    SF_TYPE(4,"科幻"),
    OTHER_TYPE(5,"惊悚"),;



    private int value;
    private String desc;

    FilmConfig(int value ,String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescByValue(int value) {
        for (FilmConfig enums : FilmConfig.values()) {
            if (enums.getValue() == value) {
                return enums.getDesc();
            }
        }
        return "";
    }


}
