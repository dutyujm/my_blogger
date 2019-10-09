package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.DifficultiesMapper;
import cn.dutyujm.pojo.Difficulties;
import cn.dutyujm.service.DifficultiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficultiesServiceImpl  implements DifficultiesService {
    @Autowired
    private DifficultiesMapper difficultiesMapper;


    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    @Override
    public int insert(Difficulties record) {
        return difficultiesMapper.insert(record);
    }

    @Override
    public int insertSelective(Difficulties record) {
        return 0;
    }

    @Override
    public Difficulties selectByPrimaryKey(Integer did) {
        return difficultiesMapper.selectByPrimaryKey(did);
    }

    @Override
    public int updateByPrimaryKeySelective(Difficulties record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Difficulties record) {
        return difficultiesMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Difficulties> getDifficulties(Integer pid) {
        return  difficultiesMapper.getDifficulties(pid);
    }

    @Override
    public Integer deleteDifficulties(Integer did) {
        return difficultiesMapper.deleteDifficulties(did);
    }
}
