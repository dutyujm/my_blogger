package cn.dutyujm.service;

import cn.dutyujm.pojo.Difficulties;

import java.util.List;

public interface DifficultiesService {

    int deleteByPrimaryKey(Integer pid);

    int insert(Difficulties record);

    int insertSelective(Difficulties record);

    Difficulties selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Difficulties record);

    int updateByPrimaryKey(Difficulties record);
    List<Difficulties> getDifficulties(Integer pid);
}
