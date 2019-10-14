package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    boolean login(String username,String password);


    Admin selectByUsername(String username);
}