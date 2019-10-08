package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Difficulties;

import java.util.List;

public interface DifficultiesMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Difficulties record);

    int insertSelective(Difficulties record);

    Difficulties selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Difficulties record);

    int updateByPrimaryKeyWithBLOBs(Difficulties record);

    int updateByPrimaryKey(Difficulties record);

    List<Difficulties> getDifficulties(Integer pid);



}