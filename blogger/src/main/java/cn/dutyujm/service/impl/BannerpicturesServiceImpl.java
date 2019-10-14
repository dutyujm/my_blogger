package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.BannerpicturesMapper;
import cn.dutyujm.pojo.Bannerpictures;
import cn.dutyujm.service.BannerpicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BannerpicturesServiceImpl implements BannerpicturesService {
    @Autowired
    private BannerpicturesMapper bannerpicturesMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Bannerpictures record) {
        return 0;
    }

    @Override
    public int insertSelective(Bannerpictures record) {
        return 0;
    }

    @Override
    public Bannerpictures selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bannerpictures record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bannerpictures record) {
        return 0;
    }

    @Override
    public List<Bannerpictures> getBannerpictures(Integer num) {
        return bannerpicturesMapper.getBannerpictures(num);
    }


}
