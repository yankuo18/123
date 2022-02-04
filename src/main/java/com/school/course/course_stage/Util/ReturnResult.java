package com.school.course.course_stage.Util;

public class ReturnResult {

    private int code ;
    private String msg ;
    private int count ;
    private Object data;

    public ReturnResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ReturnResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReturnResult(int code) {
        this.code = code;
    }

    public ReturnResult(int code, String msg, int count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
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

    public void setData(Object data) {
        this.data = data;
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
}
