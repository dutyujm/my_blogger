package cn.dutyujm.controller;

import cn.dutyujm.pojo.Projectpicture;
import cn.dutyujm.pojo.Schoolexperience;
import cn.dutyujm.service.ProjectpictureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Projectpicture")
@Api(tags = "Projectpicture-Controller", description = "项目图片")

public class ProjectpictureController {
    @Autowired
    private ProjectpictureService projectpictureService;

    /**
     * 通过pid获取图片
     * @param pid
     * @return
     */
    @ApiOperation("通过pid获取图片")
    @RequestMapping(value = "/getPicture",method = RequestMethod.GET)
    public List<Projectpicture> getPicture( @ApiParam("项目经历的pid")  @RequestParam("pid")Integer pid){
        return projectpictureService.getPicture(pid);
    }


    /**
     * 增加项目图片
     * @return
     */
    @ApiOperation("更新项目经历")
    @RequestMapping(value = "/insertProjectpicture",method = RequestMethod.POST)
    public Integer insertExperience(@RequestBody List<Projectpicture> projectpictures){
        return projectpictureService.insertProjectpicture(projectpictures);
    }





    /**
     * 删除项目图片
     * @return
     */
    @ApiOperation("更新项目经历")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Integer delete( @ApiParam("项目经历的pid") @RequestParam("pid") Integer pid ,@ApiParam("图片的地址") @RequestParam("url") String url){
        return projectpictureService.delete(pid,url);
    }

}
