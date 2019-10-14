package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.AdminMapper;
import cn.dutyujm.pojo.Aboutme;
import cn.dutyujm.pojo.Admin;
import cn.dutyujm.service.AboutmeService;
import cn.dutyujm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AdminServiceImpl  implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

    @Override
    public boolean login(String username, String password) {
        Admin admin = adminMapper.selectByUsername(username);
        if(admin != null){
            if(   admin.getPassword().equals(password) ){
             return  true;
            }
        }
        return false;
    }
}
