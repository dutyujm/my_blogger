package cn.dutyujm.service;

import cn.dutyujm.pojo.Technology;

import java.util.List;

public interface TechnologyService {


    int insert(Technology record);

    int insertSelective(Technology record);

    List<Technology> getTechnology(Integer pid);

    int insertTechnology( List<Technology> technologies);

    int delete(Integer pid,String keyWord);
}
