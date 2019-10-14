package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.TechnologyMapper;
import cn.dutyujm.pojo.Technology;
import cn.dutyujm.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private  TechnologyMapper technologyMapper;
    @Override
    public int insert(Technology record) {
        return 0;
    }

    @Override
    public int insertSelective(Technology record) {
        return 0;
    }

    @Override
    public List<Technology> getTechnology(Integer pid) {
        return technologyMapper.getTechnology(pid);
    }

    @Override
    public int insertTechnology(List<Technology> technologies) {
        return technologyMapper.insertTechnology(technologies);
    }

    @Override
    public int  delete(Integer pid,String keyWord){
        return technologyMapper.delete(pid,keyWord);
    }


}
