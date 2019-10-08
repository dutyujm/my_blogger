package cn.dutyujm.service;

import cn.dutyujm.pojo.Projectpicture;

import java.util.List;

public interface ProjectpictureService {

    int insert(Projectpicture record);

    int insertSelective(Projectpicture record);
    List<Projectpicture> getPicture(Integer pid);

    int insertProjectpicture( List<Projectpicture> projectpictures);

    int delete(Integer pid ,String url);
}
