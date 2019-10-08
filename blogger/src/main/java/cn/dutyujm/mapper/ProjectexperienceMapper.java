package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Projectexperience;

import java.util.List;

public interface ProjectexperienceMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Projectexperience record);

    int insertSelective(Projectexperience record);

    Projectexperience selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Projectexperience record);

    int updateByPrimaryKey(Projectexperience record);

    List<Projectexperience> getTitle();

     int delete(Integer pid);
}