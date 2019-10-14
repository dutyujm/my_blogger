package cn.dutyujm.service;

import cn.dutyujm.pojo.Bannerpictures;

import java.util.List;

public interface BannerpicturesService {

    int deleteByPrimaryKey(Integer id);

    int insert(Bannerpictures record);

    int insertSelective(Bannerpictures record);

    Bannerpictures selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bannerpictures record);

    int updateByPrimaryKey(Bannerpictures record);


    List<Bannerpictures> getBannerpictures(Integer num);
}
