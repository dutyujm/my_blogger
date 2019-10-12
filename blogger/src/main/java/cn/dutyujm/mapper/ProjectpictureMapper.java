package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Projectpicture;

import java.util.List;

public interface ProjectpictureMapper {
    int insert(Projectpicture record);

    int insertSelective(Projectpicture record);

    List<Projectpicture> getPicture(Integer pid);

    int insertProjectpicture(List<Projectpicture> projectpictures);


    int delete(Integer pid ,String url);

    int deleteBybody(Projectpicture projectpicture);

}