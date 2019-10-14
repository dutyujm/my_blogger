package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Bannerpictures;

import java.util.List;

public interface BannerpicturesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bannerpictures record);

    int insertSelective(Bannerpictures record);

    Bannerpictures selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bannerpictures record);

    int updateByPrimaryKey(Bannerpictures record);

    List<Bannerpictures> getBannerpictures(Integer num);


}