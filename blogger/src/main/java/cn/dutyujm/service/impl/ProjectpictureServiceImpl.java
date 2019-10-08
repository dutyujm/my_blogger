package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.ProjectpictureMapper;
import cn.dutyujm.pojo.Projectpicture;
import cn.dutyujm.service.ProjectpictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectpictureServiceImpl  implements ProjectpictureService {
    @Autowired
    private ProjectpictureMapper projectpictureMapper;

    @Override
    public int insert(Projectpicture record) {
        return 0;
    }

    @Override
    public int insertSelective(Projectpicture record) {
        return 0;
    }

    @Override
    public List<Projectpicture> getPicture(Integer pid) {
        return projectpictureMapper.getPicture(pid);
    }

    @Override
    public  int  insertProjectpicture(List<Projectpicture> projectpictures){
        return projectpictureMapper.insertProjectpicture(projectpictures);
    }

    @Override
    public int delete(Integer pid, String url) {
        return projectpictureMapper.delete(pid,url);
    }


}
