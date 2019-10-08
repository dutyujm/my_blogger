package cn.dutyujm.controller;

import cn.dutyujm.pojo.Projectexperience;
import cn.dutyujm.service.ProjectexperienceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Projectexperience")
@Api(tags = "Projectexperience-Controller", description = "项目经历")

public class ProjectexperienceController {
    @Autowired
    private ProjectexperienceService projectexperienceService;

    /**
     * 项目经历标题
     * @return
     */
    @ApiOperation("获取所有项目经历的标题")
    @RequestMapping(value = "/experience",method = RequestMethod.GET)
        public List<Projectexperience> me(){
        return projectexperienceService.getTitle();
    }

    /**
     * 项目经历
     * @param pid
     * @return
     */
    @ApiOperation("获取某个 项目经历")
        @RequestMapping(value = "/experienceDetail",method = RequestMethod.GET)
    public Projectexperience detail( @ApiParam("项目经历的pid") @RequestParam("pid")Integer pid){
        return projectexperienceService.selectByPrimaryKey(pid);
    }

    /**
     * 增加项目经历
     * @return
     */
    @ApiOperation("增加项目经历")
    @RequestMapping(value = "/insertExperience",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody Projectexperience projectexperience){
        return projectexperienceService.insertExperience(projectexperience);
    }

    /**
     * 修改项目经历
     * @param projectexperience
     * @return
     */
    @ApiOperation("更新项目经历")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public  Integer update(@RequestBody Projectexperience projectexperience){
        return  projectexperienceService.updateByPrimaryKey(projectexperience);
    }

    /**
     * 删除项目经历
     * @param pid
     * @return
     */
    @ApiOperation("删除项目经历")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public  Integer delete(@ApiParam("项目经历的pid")  @RequestParam("pid")Integer pid){
        return projectexperienceService.delete(pid);
    }


}
