package cn.dutyujm.controller;

import cn.dutyujm.feign.BloggerFeign;
import cn.dutyujm.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/blogger")
public class BloggerController {

    @Autowired
    private BloggerFeign bloggerFeign;

    /**
     * 个人信息获取
     * @return
     */

    @RequestMapping(value = "/Aboutme/me",method = RequestMethod.GET)
    public Aboutme me(){
        return bloggerFeign.me();
    }

    /**
     * 个人信息更新
     * @param aboutme
     * @return
     */
    @RequestMapping(value = "/Aboutme/update",method = RequestMethod.POST)
    public Integer me(@RequestBody Aboutme aboutme){
        return bloggerFeign.updateMe(aboutme);
    }

    /**
     * 难点
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Difficulties/getDifficulties",method = RequestMethod.GET)
    public List<Difficulties> getDifficulties(@RequestParam("pid")Integer pid){
        return bloggerFeign.getDifficulties(pid);
    }

    @RequestMapping(value = "/Difficulties/getOneDifficulty",method = RequestMethod.POST)
    public Difficulties getOneDifficulty(@RequestParam("did")Integer did){
        return  bloggerFeign.getOneDifficulty(did);
    }

    @RequestMapping(value = "/Difficulties/update",method = RequestMethod.POST)
    public Integer updateDifficulties(@RequestBody Difficulties Difficulties){
        return  bloggerFeign.updateDifficulties(Difficulties);
    }


    @RequestMapping(value = "/Difficulties/insertDifficulties" ,method = RequestMethod.POST)
    public Integer insertDifficulty(@RequestBody  List<Difficulties> difficultiesList){
      return bloggerFeign.insertDifficulty(difficultiesList);
    }

    /**
     * 删除难点
     * @param did
     * @return
     */
    @RequestMapping(value = "/Difficulties/deleteDifficulties" ,method = RequestMethod.POST)
    public Integer deleteDifficulties(@RequestParam("did")Integer did ){
        return bloggerFeign.deleteDifficulties(did);
    }


    /**
     * 得到前五个笔记
     * @return
     */
    @RequestMapping(value = "/Notes/firstNotes",method = RequestMethod.GET)
    public List<Notes> getNotes(){
        return bloggerFeign.getNotes();
    }

    /**
     * 获取所有笔记，可以按类型进行模糊查询
     * @param title
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/Notes/allNotes",method = RequestMethod.GET)
    public List<Notes> getAllNotes( @RequestParam("title") String title
            , @RequestParam(defaultValue = "1") Integer page
            , @RequestParam(defaultValue = "10") Integer limit){
        return bloggerFeign.getAllNotes(title,page,limit);
    }

    /**
     * 笔记的添加
     * @param notes
     * @return
     */
    @RequestMapping(value = "/Notes/insertNotes",method = RequestMethod.POST)
    public Integer insertNotes(@RequestBody Notes notes){
        notes.setCreattime(new Date());
        return bloggerFeign.insertNotes(notes);
    }

    /**
     * 笔记的查找
     * @param nid
     * @return
     */
    @RequestMapping(value = "/Notes/searchNotes",method = RequestMethod.GET)
    public Notes searchNotes( @RequestParam("nid") Integer nid){
        return bloggerFeign.searchNotes(nid);
    }

    /**
     * 笔记的修改
     * @param notes
     * @return
     */
    @RequestMapping(value = "/Notes/update" ,method =  RequestMethod.POST)
    public  Integer updateNotes( @RequestBody Notes notes){
        return  bloggerFeign.updateNotes(notes);

    }

    /**
     * 笔记删除
     * @param nid
     * @return
     */
    @RequestMapping(value = "/Notes/delete" ,method =  RequestMethod.POST)
    public  Integer deleteNotes( @RequestParam("nid") Integer nid){
        return  bloggerFeign.deleteNotes(nid);

    }

    /**
     * 项目经历标题
     * @return
     */
    @RequestMapping(value = "/Projectexperience/experience",method = RequestMethod.GET)
    public List<Projectexperience> meExperience(){
        return bloggerFeign.meExperience();
    }

    /**
     * 项目经历
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Projectexperience/experienceDetail",method = RequestMethod.GET)
    public Projectexperience experienceDetail(  @RequestParam("pid")Integer pid){
        return bloggerFeign.experienceDetail(pid);
    }

    /**
     * 增加项目经历
     * @return
     */
    @RequestMapping(value = "/Projectexperience/insertExperience",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody Projectexperience projectexperience){
        return bloggerFeign.insertExperience(projectexperience);
    }

    /**
     * 修改项目经历
     * @param projectexperience
     * @return
     */
    @RequestMapping(value = "/Projectexperience/update",method = RequestMethod.POST)
    public  Integer update(@RequestBody Projectexperience projectexperience){
        return  bloggerFeign.updateExperience(projectexperience);
    }

    /**
     * 删除项目经历
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Projectexperience/delete",method = RequestMethod.POST)
    public  Integer delete( @RequestParam("pid")Integer pid){
        return bloggerFeign.deleteExperience(pid);
    }

    /**
     * 获取所有的学校经历
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/getAll",method = RequestMethod.GET)
    public List<Schoolexperience> getAll(){
        return bloggerFeign.getAll();
    }


    /**
     * 新增学校经历
     * @param schoolexperience
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/insertExperience",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody Schoolexperience schoolexperience){
        return bloggerFeign.insertExperience(schoolexperience);
    }

    /**
     * 获取学校经历
     * @param eid
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/getByEid",method = RequestMethod.GET)
    public Schoolexperience   getByEid(  @RequestParam("eid") Integer eid){
        return bloggerFeign.getByEid(eid);
    }

    /**
     * 校园经历更新接口
     * @param schoolexperience
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/update",method = RequestMethod.POST)
    public Integer   update(@RequestBody Schoolexperience schoolexperience){
        return bloggerFeign.updateSchoolexperience(schoolexperience);
    }

    /**
     * 校园经历删除接口
     * @param eid
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/delete",method = RequestMethod.POST)
    public Integer   deleteSchoolexperience(@RequestParam("eid") Integer eid){
        return bloggerFeign.deleteSchoolexperience(eid);
    }

    /**
     * 获取项目使用过的技术
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Technology/getTechnology",method = RequestMethod.GET)
    public List<Technology> getTechnology(  @RequestParam("pid")Integer pid){
        return bloggerFeign.getTechnology(pid);
    }


    /**
     * 新增项目使用过的技术
     * @return
     */
    @RequestMapping(value = "/Technology/insertTechnology",method = RequestMethod.POST)
    public Integer insertTechnology(@RequestBody List<Technology> technologies){
        return bloggerFeign.insertTechnology(technologies);
    }

    /**
     * 删除技术点
     * @param pid
     * @param keyWord
     * @return
     */
    @RequestMapping(value = "/Technology/delete",method = RequestMethod.DELETE)
    public Integer delete(  @RequestParam("pid")Integer pid
            ,  @RequestParam("keyWord")String keyWord){
        return  bloggerFeign.deleteTechnology(pid,keyWord);
    }





    /**
     * 通过pid获取图片
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Projectpicture/getPicture",method = RequestMethod.GET)
    public List<Projectpicture> getPicture( @RequestParam("pid")Integer pid){
        return bloggerFeign.getPicture(pid);

    }


    /**
     * 增加项目图片
     * @return
     */
    @RequestMapping(value = "/Projectpicture/insertProjectpicture",method = RequestMethod.POST)
    public Integer insertProjectpicture(@RequestBody List<Projectpicture> projectpictures){
        return bloggerFeign.insertProjectpicture(projectpictures);
    }

    /**
     * 增加一张项目图片
     * @return
     */
    @RequestMapping(value = "/Projectpicture/insertOneProjectpicture",method = RequestMethod.POST)
    public Integer insertOneProjectpicture(@RequestBody Projectpicture projectpicture){
        return bloggerFeign.insertOneProjectpicture(projectpicture);
    }



    /**
     * 删除项目图片
     * @return
     */
    @RequestMapping(value = "/Projectpicture/delete",method = RequestMethod.POST)
    public Integer deleteProjectpicture(  @RequestParam("pid") Integer pid ,@RequestParam("url") String url){
        return bloggerFeign.deleteProjectpicture(pid,url);
    }


    /**
     * 删除项目图片
     * @return
     */
    @RequestMapping(value = "/Projectpicture/deleteBybody",method = RequestMethod.POST)
    public Integer deleteProjectpictureBybody(@RequestBody Projectpicture projectpicture){
        return bloggerFeign.deleteProjectpictureBybody(projectpicture);
    }
    /**
     * 图片上传接口
     * @param file
     * @param pid
     * @return
     */
    @RequestMapping(value="/Projectpicture/testuploadimg", method = RequestMethod.POST)
    public  String testuploadimg(@RequestParam("file") MultipartFile file,@RequestParam("pid") Integer pid) {
       return bloggerFeign.testuploadimg(file,pid);
    }

    /**
     *  图片上传接口（正式）
     * @param file
     * @param pid
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/Projectpicture/uploadImg",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadImg(@RequestPart(value = "file") MultipartFile file, @RequestParam("pid") Integer pid) throws IOException {
        return   bloggerFeign.uploadImg(file, pid);
    }


}
