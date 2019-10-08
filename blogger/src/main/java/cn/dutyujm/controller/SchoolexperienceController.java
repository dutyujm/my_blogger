package cn.dutyujm.controller;

import cn.dutyujm.pojo.Notes;
import cn.dutyujm.pojo.Schoolexperience;
import cn.dutyujm.service.SchoolexperienceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Schoolexperience")
@Api(tags = "Schoolexperience-Controller", description = "学校经历")

public class SchoolexperienceController {
    @Autowired
    private SchoolexperienceService schoolexperienceService;

    /**
     * 获取所有的学校经历
     * @return
     */
    @ApiOperation("获取所有的学校经历")
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Schoolexperience> getAll(){
        return schoolexperienceService.getAll();
    }


    /**
     * 新增学校经历
      * @param schoolexperience
     * @return
     */
    @ApiOperation("新增学校经历")
    @RequestMapping(value = "/insertExperience",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody Schoolexperience schoolexperience){
        return schoolexperienceService.insert(schoolexperience);
    }

    /**
     * 获取学校经历
     * @param eid
     * @return
     */
    @ApiOperation("获取某个学校经历")
    @RequestMapping(value = "/getByEid",method = RequestMethod.GET)
    public Schoolexperience   getByEid( @ApiParam("项目经历的eid") @RequestParam("eid") Integer eid){
        return schoolexperienceService.selectByPrimaryKey(eid);
    }

    /**
     * 校园经历更新接口
     * @param schoolexperience
     * @return
     */
    @ApiOperation("修改某个项目经历")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Integer   update(@RequestBody Schoolexperience schoolexperience){
        return schoolexperienceService.updateByPrimaryKey(schoolexperience);
    }

    /**
     * 校园经历删除接口
     * @param eid
     * @return
     */
    @ApiOperation("更新项目经历")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Integer   delete(@RequestParam("eid") Integer eid){
        return schoolexperienceService.deleteByPrimaryKey(eid);
    }







}
