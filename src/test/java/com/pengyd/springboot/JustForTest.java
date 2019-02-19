package com.pengyd.springboot;

import org.junit.Test;

/**
 * @Author pengyd
 * @Date 2018/7/3 10:37
 * @function:
 */
public class JustForTest {


    @Test
    public void ttt() {
        String test = test("{result=78,   hupu=  sdfg,huji =aa,jk=09}");
        String replace = test.replace(" ", "");
        System.out.println(replace);

//        System.out.println(test);
    }

    public String test(String a) {
//        String src = "{result=78,hupu=sdfg,huji=计较,jk=09}";

        String[] split = a.split("\\,");

        String result = "";
        //处理String成json
        for (int i = 0; i < split.length; i++) {
            //第一个要特殊处理
            if (i == 0) {
                result = "{";
                String[] s1 = split[i].substring(1).split("=");
                String hh = "";
                for (int j = 0; j < s1.length; j++) {
                    if (j == 0) {
                        hh = hh(s1[j]) + ":";
                    } else {
                        hh = hh + hh(s1[j]);
                    }
                }
                if (i == split.length - 1) {
                    return result = result + hh + "}";
                }
                result = result + hh + ",";
            } else if (i == split.length - 1) {
                String[] split1 = split[i].substring(0, split[i].length() - 1).split("=");
                String ww = "";
                for (int j = 0; j < split1.length; j++) {
                    if (j == 0) {
                        ww = hh(split1[j]) + ":";
                    } else {
                        ww = ww + hh(split1[j]);
                    }
                }
                return result = result + ww + "}";
            }else {
                String[] split1 = split[i].split("=");
                String aa = "";
                for (int j = 0; j < split1.length; j++) {
                    if (j == 0) {
                        aa = hh(split1[j]) + ":";
                    } else {
                        aa = aa + hh(split1[j]);
                    }
                }
                result = result + aa + ",";
            }
        }
        return "";

    }

    public String hh(String s) {
        return "\"" + s + "\"";
    }

}
