package com.school.course.course_stage.Util;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FileTools {

//    public static void main(String args[]){
//        System.out.println(System.currentTimeMillis());
//    }

    public static void createFilePath(String filePath){
        File myFolder = new File(filePath);
        if (!myFolder.exists()){
            myFolder.mkdirs();
        }
    }

    public static boolean saveImage(String path,String name,byte[] imageFile){
        try {
            File imagePath = new File(path);
            FileTools.createFilePath(path);
            FileOutputStream outputStream = new FileOutputStream(path+"/"+name);
            outputStream.write(imageFile);
            outputStream.flush();
            outputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String saveFile(String systemPath,String path,MultipartFile file)throws Exception{
        //获取原文件的文件名
        String oldName=file.getOriginalFilename();
        //原文件的类型
        String type=oldName.substring(oldName.indexOf(".")); // 格式为.jpg 或 .png 或 ......
        //将文件名修改为时间戳，避免原文件出现文件名过长情况
        String filename =  System.currentTimeMillis() + type;
        // 如果目录不存在则创建
        File tempFile=new File(systemPath+path+"/"+filename);
        if (!tempFile.getParentFile().exists()){
            tempFile.getParentFile().mkdirs();//创建父级文件路径
            tempFile.createNewFile();//创建文件
        }
        //通过CommonsMultipartFile的方法直接写文件
        file.transferTo(tempFile);
        return path+"/"+filename;
    }

    public static void saveMulFile(String systemPath, String path, HttpServletRequest request)throws Exception{
        CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //将request变成多部分request
        MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
        //获取multiRequest 中所有的文件名
        Iterator iter=multiRequest.getFileNames();
        while(iter.hasNext())
        {
            //一次遍历所有文件
            MultipartFile file=multiRequest.getFile(iter.next().toString());
            if(file!=null)
            {
                FileTools.saveFile(systemPath,path,file);
            }
        }
    }










}
