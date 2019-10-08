package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Aboutme;

public interface AboutmeMapper {
    int deleteByPrimaryKey(String name);

    int insert(Aboutme record);

    int insertSelective(Aboutme record);

    Aboutme selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Aboutme record);

    int updateByPrimaryKey(Aboutme record);


    Aboutme getMe();
    int update(Aboutme record);
}