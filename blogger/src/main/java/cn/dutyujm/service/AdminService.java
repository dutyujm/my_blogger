package cn.dutyujm.service;

import cn.dutyujm.pojo.Admin;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface AdminService {


    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    boolean login(String username,String password);
}
