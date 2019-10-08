package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.SchoolexperienceMapper;
import cn.dutyujm.pojo.Schoolexperience;
import cn.dutyujm.service.SchoolexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolexperienceServiceImpl implements SchoolexperienceService {
    @Autowired
    private SchoolexperienceMapper schoolexperienceMapper;


    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return schoolexperienceMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public int insert(Schoolexperience record) {
        return schoolexperienceMapper.insert(record);
    }

    @Override
    public int insertSelective(Schoolexperience record) {
        return 0;
    }

    @Override
    public Schoolexperience selectByPrimaryKey(Integer eid) {
        return schoolexperienceMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateByPrimaryKeySelective(Schoolexperience record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Schoolexperience record) {
        return schoolexperienceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Schoolexperience> getAll() {
        return schoolexperienceMapper.getAll();
    }


}
