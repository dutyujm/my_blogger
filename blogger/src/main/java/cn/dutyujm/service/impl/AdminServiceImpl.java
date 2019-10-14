package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.AdminMapper;
import cn.dutyujm.pojo.Aboutme;
import cn.dutyujm.pojo.Admin;
import cn.dutyujm.service.AboutmeService;
import cn.dutyujm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class AdminServiceImpl  implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        /**
         * 加密存储
         */
        bCryptPasswordEncoder = new BCryptPasswordEncoder();

        record.setPassword(bCryptPasswordEncoder.encode(record.getPassword()));
        return adminMapper.insert(record);
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

        /**
         * 加密登录
         */
        bCryptPasswordEncoder = new BCryptPasswordEncoder();

        Admin admin = adminMapper.selectByUsername(username);
        try{
        if(admin != null){
            if(  bCryptPasswordEncoder.matches(password, admin.getPassword()) ){
             return  true;
            }
        }}catch (Exception e){

        }
        return false;
    }
}
