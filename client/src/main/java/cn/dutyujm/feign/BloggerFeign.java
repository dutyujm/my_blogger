package cn.dutyujm.feign;


import cn.dutyujm.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.dutyujm.feign.hystrix.*;

import java.util.Date;
import java.util.List;


@FeignClient(value = "blogger", fallback = BloggerFeignHystrix.class)
public interface BloggerFeign {

    /**
     * 个人信息获取
     * @return
     */
    @RequestMapping(value = "/Aboutme/me",method = RequestMethod.GET)
     Aboutme me();

    /**
     *
     * @param aboutme
     * @return
     */
    @RequestMapping(value = "/Aboutme/update",method = RequestMethod.POST)
     Integer updateMe(@RequestBody Aboutme aboutme);

    /**
     * 难点
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Difficulties/getDifficulties",method = RequestMethod.GET)
     List<Difficulties> getDifficulties(@RequestParam("pid")Integer pid);

    @RequestMapping(value = "/Difficulties/getOneDifficulty",method = RequestMethod.POST)
     Difficulties getOneDifficulty(@RequestParam("did")Integer did);

    @RequestMapping(value = "/Difficulties/update",method = RequestMethod.POST)
     Integer updateDifficulties(@RequestBody Difficulties Difficulties);

    @RequestMapping(value = "/Difficulties/insertDifficulties" ,method = RequestMethod.POST)
    public Integer insertDifficulty(@RequestBody  List<Difficulties> difficultiesList);

    /**
     * 删除难点
     * @param did
     * @return
     */
    @RequestMapping(value = "/Difficulties/deleteDifficulties" ,method = RequestMethod.POST)
    public Integer deleteDifficulties(@RequestParam("did")Integer did );




    /**
     * 得到前五个笔记
     * @return
     */
    @RequestMapping(value = "/Notes/firstNotes",method = RequestMethod.GET)
     List<Notes> getNotes();

    /**
     * 获取所有笔记，可以按类型进行模糊查询
     * @param title
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/Notes/allNotes",method = RequestMethod.GET)
     List<Notes> getAllNotes( @RequestParam("title") String title
            , @RequestParam(defaultValue = "1") Integer page
            , @RequestParam(defaultValue = "10") Integer limit);

    /**
     * 笔记的添加
     * @param notes
     * @return
     */
    @RequestMapping(value = "/Notes/insertNotes",method = RequestMethod.POST)
     Integer insertNotes( @RequestBody Notes notes);

    /**
     * 笔记的查找
     * @param nid
     * @return
     */
    @RequestMapping(value = "/Notes/searchNotes",method = RequestMethod.GET)
     Notes searchNotes(@RequestParam("nid") Integer nid);

    /**
     * 笔记的修改
     * @param notes
     * @return
     */
    @RequestMapping(value = "/Notes/update" ,method =  RequestMethod.POST)
      Integer updateNotes( @RequestBody Notes notes);

    /**
     * 笔记删除
     * @param nid
     * @return
     */
    @RequestMapping(value = "/Notes/delete" ,method =  RequestMethod.POST)
      Integer deleteNotes( @RequestParam("nid") Integer nid);


    /**
     * 项目经历标题
     * @return
     */
    @RequestMapping(value = "/Projectexperience/experience",method = RequestMethod.GET)
     List<Projectexperience> meExperience();

    /**
     * 项目经历
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Projectexperience/experienceDetail",method = RequestMethod.GET)
     Projectexperience experienceDetail( @RequestParam("pid")Integer pid);

    /**
     * 增加项目经历
     * @return
     */
    @RequestMapping(value = "/Projectexperience/insertExperience",method = RequestMethod.POST)
     Integer insertExperience(@RequestBody Projectexperience projectexperience);
    /**
     * 修改项目经历
     * @param projectexperience
     * @return
     */
    @RequestMapping(value = "/Projectexperience/update",method = RequestMethod.POST)
      Integer updateExperience(@RequestBody Projectexperience projectexperience);

    /**
     * 删除项目经历
     * @param pid
     * @return
     */
    @RequestMapping(value = "/Projectexperience/delete",method = RequestMethod.POST)
      Integer deleteExperience(@RequestParam("pid")Integer pid);










    /**
     * 获取所有的学校经历
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/getAll",method = RequestMethod.GET)
    public List<Schoolexperience> getAll();


    /**
     * 新增学校经历
     * @param schoolexperience
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/insertExperience",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody Schoolexperience schoolexperience);

    /**
     * 获取学校经历
     * @param eid
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/getByEid",method = RequestMethod.GET)
    public Schoolexperience   getByEid(  @RequestParam("eid") Integer eid);

    /**
     * 校园经历更新接口
     * @param schoolexperience
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/update",method = RequestMethod.POST)
    public Integer   updateSchoolexperience(@RequestBody Schoolexperience schoolexperience);

    /**
     * 校园经历删除接口
     * @param eid
     * @return
     */
    @RequestMapping(value = "/Schoolexperience/delete",method = RequestMethod.POST)
    public Integer   deleteSchoolexperience(@RequestParam("eid") Integer eid);






    /**
     * 获取项目使用过的技术
     * @param pid
     * @return
     */

    @RequestMapping(value = "/Technology/getTechnology",method = RequestMethod.GET)
    public List<Technology> getTechnology(  @RequestParam("pid")Integer pid);


    /**
     * 新增项目使用过的技术
     * @return
     */
    @RequestMapping(value = "/Technology/insertTechnology",method = RequestMethod.POST)
    public Integer insertTechnology(@RequestBody List<Technology> technologies);

    /**
     * 删除技术点
     * @param pid
     * @param keyWord
     * @return
     */
    @RequestMapping(value = "/Technology/delete",method = RequestMethod.DELETE)
    public Integer deleteTechnology( @RequestParam("pid")Integer pid
            ,  @RequestParam("keyWord")String keyWord);





}
