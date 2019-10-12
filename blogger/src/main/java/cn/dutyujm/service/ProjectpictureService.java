package cn.dutyujm.service;

import cn.dutyujm.pojo.Projectexperience;
import cn.dutyujm.pojo.Projectpicture;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ProjectpictureService {

    int insert(Projectpicture record);

    int insertSelective(Projectpicture record);

    List<Projectpicture> getPicture(Integer pid);

    int insertProjectpicture(List<Projectpicture> projectpictures);

    int delete(Integer pid, String url);

    int deleteBybody(Projectpicture projectpicture);

    String uploadImg(MultipartFile file, Integer pid) throws IOException;

}

