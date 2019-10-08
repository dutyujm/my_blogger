package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Technology;

import java.util.List;

public interface TechnologyMapper {
    int insert(Technology record);

    int insertSelective(Technology record);

    List<Technology> getTechnology(Integer pid);

    int insertTechnology( List<Technology> technologies);

    int delete(Integer pid,String keyWord);
}