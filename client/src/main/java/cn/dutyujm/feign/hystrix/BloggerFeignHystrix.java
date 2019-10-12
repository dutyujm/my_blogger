package cn.dutyujm.feign.hystrix;

import cn.dutyujm.feign.BloggerFeign;
import cn.dutyujm.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
        return null;
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
        return null;
    }

    @Override
    public Integer insertDifficulty(List<Difficulties> difficultiesList) {
        return null;
    }

    @Override
    public Integer deleteDifficulties(Integer did) {
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
        return null;
    }

    @Override
    public Notes searchNotes(Integer nid) {
        return null;
    }

    @Override
    public Integer updateNotes(Notes notes) {
        return null;
    }

    @Override
    public Integer deleteNotes(Integer nid) {
        return null;
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
        return null;
    }

    @Override
    public Integer updateExperience(Projectexperience projectexperience) {
        return null;
    }

    @Override
    public Integer deleteExperience(Integer pid) {
        return null;
    }

    @Override
    public List<Schoolexperience> getAll() {
        return null;
    }

    @Override
    public Integer insertExperience(Schoolexperience schoolexperience) {
        return null;
    }

    @Override
    public Schoolexperience getByEid(Integer eid) {
        return null;
    }

    @Override
    public Integer updateSchoolexperience(Schoolexperience schoolexperience) {
        return null;
    }

    @Override
    public Integer deleteSchoolexperience(Integer eid) {
        return null;
    }

    @Override
    public List<Technology> getTechnology(Integer pid) {
        return null;
    }

    @Override
    public Integer insertTechnology(List<Technology> technologies) {
        return null;
    }

    @Override
    public Integer deleteTechnology(Integer pid, String keyWord) {
        return null;
    }

    @Override
    public List<Projectpicture> getPicture(Integer pid) {
        return null;
    }

    @Override
    public Integer insertProjectpicture(List<Projectpicture> projectpictures) {
        return null;
    }

    @Override
    public Integer insertOneProjectpicture(Projectpicture projectpicture) {
        return null;
    }

    @Override
    public Integer deleteProjectpicture(Integer pid, String url) {
        return null;
    }

    @Override
    public Integer deleteProjectpictureBybody(Projectpicture projectpicture) {
        return null;
    }

    @Override
    public String testuploadimg(MultipartFile file, Integer pid) {
        return null;
    }

    @Override
    public String uploadImg(MultipartFile file, Integer pid) throws IOException {
        return null;
    }
}
