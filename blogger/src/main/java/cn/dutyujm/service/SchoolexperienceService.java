package cn.dutyujm.service;

import cn.dutyujm.pojo.Notes;
import cn.dutyujm.pojo.Schoolexperience;

import java.util.List;

public interface SchoolexperienceService {
    int deleteByPrimaryKey(Integer eid);

    int insert(Schoolexperience record);

    int insertSelective(Schoolexperience record);

    Schoolexperience selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Schoolexperience record);

    int updateByPrimaryKey(Schoolexperience record);

    List<Schoolexperience> getAll();


}
