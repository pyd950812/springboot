package com.pengyd.springboot;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @Author pengyd
 * @Date 2018/7/3 10:37
 * @function:
 */
public class JustForTest {

    public static void main(String[] args) {

        // 一个未转化的字符串
        String str = "[{name:'a',value:'aa'},{name:'b',value:'bb'},{name:'c',value:'cc'},{name:'d',value:'dd'}]" ;
        // 首先把字符串转成 JSONArray  对象
        JSONArray json = JSONArray.fromObject(str );
        if(json.size()>0) {
            for (int i = 0; i < json.size(); i++) {
                // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                JSONObject job = json.getJSONObject(i);

            }
        }
    }

}
