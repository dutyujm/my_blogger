package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.ProjectexperienceMapper;
import cn.dutyujm.pojo.Projectexperience;
import cn.dutyujm.service.ProjectexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectexperienceServiceImpl implements ProjectexperienceService {

    @Autowired
    private ProjectexperienceMapper projectexperienceMapper;


    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    @Override
    public int insert(Projectexperience record) {
        return 0;
    }

    @Override
    public int insertSelective(Projectexperience record) {
        return 0;
    }

    @Override
    public Projectexperience selectByPrimaryKey(Integer pid) {
        return projectexperienceMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Projectexperience record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Projectexperience record) {
        return projectexperienceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Projectexperience> getTitle() {
        return projectexperienceMapper.getTitle();
    }

    @Override
    public int insertExperience(Projectexperience record) {
        projectexperienceMapper.insert(record);
        return  record.getPid();
    }

    @Override
    public int delete(Integer pid) {
        return projectexperienceMapper.delete(pid);
    }


}
