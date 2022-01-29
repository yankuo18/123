package com.school.course.course_stage.Util;


import java.util.Base64;

public class Tools {

    public static String getToken(String account){

        String time = Long.toString(System.currentTimeMillis());

        time = Base64.getEncoder().encodeToString(time.getBytes());

        String token = "";

        for (int i = 0; i < time.length(); i++) {
            token += time.getBytes()[i] ;
        }

        token += account ;

        return token;
    }





}
