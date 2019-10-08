package cn.dutyujm.feign.hystrix;

import cn.dutyujm.feign.BloggerFeign;
import cn.dutyujm.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j

public class BloggerFeignHystrix implements BloggerFeign {


    @Override
    public Aboutme me() {
        return null;
    }

    @Override
    public Integer updateMe(Aboutme aboutme) {
        return 0;
    }

    @Override
    public List<Difficulties> getDifficulties(Integer pid) {
        return null;
    }

    @Override
    public Difficulties getOneDifficulty(Integer did) {
        return null;
    }

    @Override
    public Integer updateDifficulties(Difficulties Difficulties) {
        return 0;
    }

    @Override
    public Integer insertDifficulty(List<Difficulties> difficultiesList) {
        return null;
    }

    @Override
    public List<Notes> getNotes() {
        return null;
    }

    @Override
    public List<Notes> getAllNotes(String title, Integer page, Integer limit) {
        return null;
    }

    @Override
    public Integer insertNotes(Notes notes) {
        return 0;
    }

    @Override
    public Notes searchNotes(Integer nid) {
        return null;
    }

    @Override
    public Integer updateNotes(Notes notes) {
        return 0;
    }

    @Override
    public Integer deleteNotes(Integer nid) {
        return 0;
    }

    @Override
    public List<Projectexperience> meExperience() {
        return null;
    }

    @Override
    public Projectexperience experienceDetail(Integer pid) {
        return null;
    }

    @Override
    public Integer insertExperience(Projectexperience projectexperience) {
        return 0;
    }

    @Override
    public Integer updateExperience(Projectexperience projectexperience) {
        return 0;
    }

    @Override
    public Integer deleteExperience(Integer pid) {
        return 0;
    }

    @Override
    public List<Schoolexperience> getAll() {
        return null;
    }

    @Override
    public Integer insertExperience(Schoolexperience schoolexperience) {
        return 0;
    }

    @Override
    public Schoolexperience getByEid(Integer eid) {
        return null;
    }

    @Override
    public Integer updateSchoolexperience(Schoolexperience schoolexperience) {
        return 0;
    }

    @Override
    public Integer deleteSchoolexperience(Integer eid) {
        return 0;
    }

    @Override
    public List<Technology> getTechnology(Integer pid) {
        return null;
    }

    @Override
    public Integer insertTechnology(List<Technology> technologies) {
        return 0;
    }

    @Override
    public Integer deleteTechnology(Integer pid, String keyWord) {
        return 0;
    }
}
