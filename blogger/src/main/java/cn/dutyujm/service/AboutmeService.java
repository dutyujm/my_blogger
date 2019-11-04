package cn.dutyujm.service;

import cn.dutyujm.pojo.Aboutme;

public interface AboutmeService {
    int insert(Aboutme record);

    int insertSelective(Aboutme record);
    Aboutme getMe();
    int update(Aboutme record);
    Object test();
}
