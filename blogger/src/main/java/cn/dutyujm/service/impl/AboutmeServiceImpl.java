package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.AboutmeMapper;
import cn.dutyujm.pojo.Aboutme;
import cn.dutyujm.service.AboutmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AboutmeServiceImpl implements AboutmeService {
    @Autowired
    private  AboutmeMapper aboutmeMapper;

    @Override
    public int insert(Aboutme record) {
        return 0;
    }

    @Override
    public int insertSelective(Aboutme record) {
        return 0;
    }

    @Override
    public Aboutme getMe() {
        return aboutmeMapper.getMe();
    }

    @Override
    public int update(Aboutme record) {
        return aboutmeMapper.update(record);
    }
}
