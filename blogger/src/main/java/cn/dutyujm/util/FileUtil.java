package cn.dutyujm.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
    /**
     * 第一步：判断文件是否为空   true：返回提示为空信息   false：执行第二步
     * 第二步：判断目录是否存在   不存在：创建目录
     * 第三部：通过输出流将文件写入硬盘文件夹并关闭流
     * @param file
     * @return
     */
    public static String uploadFile(MultipartFile file){
        String fileName = file.getOriginalFilename();
        String filePath = "D:\\apache-tomcat-9.0.24\\webapps\\photo\\";
        File targetFile = new File(filePath);
        //第一步：判断文件是否为空
        if(file.isEmpty())return fileName+"文件为空";
        //第二步：判断目录是否存在   不存在：创建目录
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        //第三部：通过输出流将文件写入硬盘文件夹并关闭流
        BufferedOutputStream stream = null;
        try {
            stream = new BufferedOutputStream(new FileOutputStream(filePath+fileName));
            stream.write(file.getBytes());
            stream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (stream != null) stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileName+"上传成功";
    }
}
