package com.school.course.course_stage.Util;

import java.util.HashMap;
import java.util.Map;

public class ReturnResult {

    private int code ;
    private String msg ;
    private int count ;
//    private Object data;
    private Map<String,Object> data;


    public ReturnResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReturnResult(int code) {
        this.code = code;
    }
    public ReturnResult() {
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Map<String,Object> toMap(int code , String msg  , String name , Object object, int count ){

        Map<String,Object> maps = new HashMap<>(16);
        maps.put("code",code);
        maps.put("msg",msg);
        Map<String , Object> map = new HashMap<>();

        map.put(name,object);

        maps.put("data",map);
        maps.put("count",count);
        return maps;
    }

    public Map<String,Object> toMap(int code , String msg , String name , Object object){

        Map<String,Object> maps = new HashMap<>(16);
        maps.put("code",code);
        maps.put("msg",msg);

        Map<String , Object> map = new HashMap<>();

        map.put(name,object);

        maps.put("data",map);

        return maps;
    }

    public Map<String,Object> toMap(int code , String msg ,Object object){

        Map<String,Object> maps = new HashMap<>(16);
        maps.put("code",code);
        maps.put("msg",msg);

        maps.put("data",object);
        return maps;
    }

    public Map<String,Object> toMap(int code , String msg ){

        Map<String,Object> maps = new HashMap<>(16);
        maps.put("code",code);
        maps.put("msg",msg);
        return maps;
    }


}
