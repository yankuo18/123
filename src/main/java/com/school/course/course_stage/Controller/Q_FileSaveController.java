package com.school.course.course_stage.Controller;

import com.school.course.course_stage.Util.FileTools;
import com.school.course.course_stage.Util.ReturnResult;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/q_fileSave")
public class Q_FileSaveController {




    @RequestMapping("/image")
    public Map<String,Object> KindEditorImageSave(@RequestParam("imgFile") MultipartFile files ,
                                                  HttpServletRequest request){


        Map<String,Object> jb = new HashMap<>(16);
        jb.put("error",1);

//        //定义允许上传的文件扩展名
        Map<String, String> extMap = new HashMap<String, String>(16);
        extMap.put("image", ".gif,.jpg,.jpeg,.png,.bmp");
//        extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
//        extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");

         //最大文件大小
        long maxSize = 1024 * 1024 *2;
//        if(!ServletFileUpload.isMultipartContent(request)){
//            jb.put("error", 1);
//            jb.put("message", "请选择文件");
//            return jb;
//        }

        String dirName  =request.getParameter("dir");

        //获取原文件的文件名
        String oldName=files.getOriginalFilename();
        //原文件的类型
        String type=oldName.substring(oldName.indexOf(".")); // 格式为.jpg 或 .png 或 ......

        System.out.println(type);

        if (dirName.equals("image")) {
            if (!extMap.get("image").contains(type)){

                jb.put("error", 1);
                jb.put("message", "请上传正确的的图片格式");
                return jb;
            }
        }

        try {
            String systemPath = request.getSession().getServletContext().getContextPath();

            String staticPath = ResourceUtils.getURL("classpath:").getPath()+"static";

            System.out.println(staticPath);

            String path = "/images/CourseDetail";

            String resultPath = FileTools.saveFile(staticPath,path,files);

            jb.put("error", 0);
            jb.put("message", "上传成功！");
            jb.put("url",resultPath);

            System.out.println(resultPath);

            return jb ;
        }catch (Exception e){
            e.printStackTrace();
        }

        jb.put("error", 1);
        jb.put("message", "上传失败！");
        return  jb;
    }


    public Map<String,Object> fileSave(){



        return  null;
    }

//    @RequestMapping(value="uploadOK")
//    public @ResponseBody String uploadOK(@RequestParam("imgFile") CommonsMultipartFile[] files, HttpServletRequest request, Map<String, Object> model, HttpServletResponse response){
//        JSONObject jb=new JSONObject();
//        jb.put("error", 0);
//        //文件保存目录路径
//
//        //定义允许上传的文件扩展名
//        HashMap<String, String> extMap = new HashMap<String, String>();
//        extMap.put("image", "gif,jpg,jpeg,png,bmp");
//        extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
//        extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
//
//        //最大文件大小
//        long maxSize = 1024 * 1024 *2;
//        if(!ServletFileUpload.isMultipartContent(request)){
//            jb.put("error", 1);
//            jb.put("message", "请选择文件");
//            return jb.toJSONString();
//        }
//        String dirName  =request.getParameter("dir");
//        if (dirName == null) {
//            dirName = "image";
//        }
//        if(!extMap.containsKey(dirName)){
//            jb.put("error", 1);
//            jb.put("message", "目录名不正确");
//            return jb.toJSONString();
//        }
//        try {
//
//            if (files!=null&&files.length>0) {
//                for (CommonsMultipartFile commonsMultipartFile : files) {
//                    Map upload = mySftp.upload(commonsMultipartFile);
//                    jb.put("error", 0);
//                    jb.put("message", "上传成功！");
//                    jb.put("url",返回的一定要是绝对的路径);
//                    return jb.toJSONString();
//                }
//            }
//        } catch (Exception e1) {
//            jb.put("error", 1);
//            jb.put("message", e1.getMessage());
//            return jb.toJSONString();
//        }
//        return jb.toJSONString();
//    }







}
