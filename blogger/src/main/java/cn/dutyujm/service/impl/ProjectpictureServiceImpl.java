package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.ProjectpictureMapper;
import cn.dutyujm.pojo.Projectpicture;
import cn.dutyujm.service.ProjectpictureService;
import com.github.tobato.fastdfs.domain.MateData;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import io.micrometer.core.instrument.util.StringUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.security.jgss.HttpCaller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProjectpictureServiceImpl  implements ProjectpictureService {
    @Autowired
    private ProjectpictureMapper projectpictureMapper;

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    @Value("${fdfs.reqHost}")
    private String reqHost;

    @Value("${fdfs.reqPort}")
    private String reqPort;

    @Override
    public int insert(Projectpicture record) {
        return projectpictureMapper.insert(record);
    }

    @Override
    public int insertSelective(Projectpicture record) {
        return 0;
    }

    @Override
    public List<Projectpicture> getPicture(Integer pid) {
        List<Projectpicture> projectpictureList = projectpictureMapper.getPicture(pid);
        for (Projectpicture tmp : projectpictureList){
            tmp.setUrl("http://"+reqHost+":"+reqPort+"/"+tmp.getUrl());
        }
        return projectpictureList;
    }

    @Override
    public  int  insertProjectpicture(List<Projectpicture> projectpictures){
        return projectpictureMapper.insertProjectpicture(projectpictures);
    }

    @Override
    public int delete(Integer pid, String url) {
        return projectpictureMapper.delete(pid,url);
    }

    @Override
    public int deleteBybody(Projectpicture projectpicture) {

        int tmpInt = projectpicture.getPid();
        String tmpUrl =projectpicture.getUrl();
        StorePath storePath =StorePath.praseFromUrl(tmpUrl);

        if (StringUtils.isEmpty(tmpUrl)) {
            return 0;
        }
        try {

            fastFileStorageClient.deleteFile(tmpUrl);
            System.out.println(storePath.getGroup());
            System.out.println(storePath.getPath());

            fastFileStorageClient.deleteFile(storePath.getGroup(), storePath.getPath());
        } catch (Exception e) {

        }
        tmpUrl = storePath.getGroup()+"/"+storePath.getPath();
        return projectpictureMapper.delete(tmpInt,tmpUrl);
    }

    @Override
    public String uploadImg(MultipartFile file, Integer pid) throws IOException {
        // 设置文件信息
        Set<MateData> mataData = new HashSet<>();
        mataData.add(new MateData("author", "yu"));
        mataData.add(new MateData("description", "photo"));

        // 上传   （文件上传可不填文件信息，填入null即可）
        StorePath storePath = fastFileStorageClient.uploadFile(file.getInputStream(), file.getSize(), FilenameUtils.getExtension(file.getOriginalFilename()), mataData);
        System.out.println(storePath.getFullPath());
        Projectpicture projectpicture = new Projectpicture();
//        projectpicture.setUrl("http://"+reqHost+":"+reqPort+"/"+storePath.getFullPath());
        projectpicture.setUrl(storePath.getFullPath());
        projectpicture.setPid(pid);
        if(projectpictureMapper.insert(projectpicture)>0){
            return "http://"+reqHost+":"+reqPort+"/"+storePath.getFullPath();
        }else {
            return "false";
        }
    }


}
