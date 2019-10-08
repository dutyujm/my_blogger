package cn.dutyujm.controller;

import cn.dutyujm.pojo.Projectexperience;
import cn.dutyujm.pojo.Technology;
import cn.dutyujm.service.TechnologyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Technology")
@Api(tags = "Technology-Controller", description = "技术")

public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    /**
     * 获取项目使用过的技术
     * @param pid
     * @return
     */
    @ApiOperation("获取项目使用过的技术")

    @RequestMapping(value = "/getTechnology",method = RequestMethod.GET)
    public List<Technology> getTechnology( @ApiParam("项目经历的pid") @RequestParam("pid")Integer pid){
        return technologyService.getTechnology(pid);
    }


    /**
     * 新增项目使用过的技术
     * @return
     */
    @ApiOperation("新增项目使用过的技术")
    @RequestMapping(value = "/insertTechnology",method = RequestMethod.POST)
    public Integer getTechnology(@RequestBody List<Technology> technologies){
        return technologyService.insertTechnology(technologies);
    }

    /**
     * 删除技术点
     * @param pid
     * @param keyWord
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public Integer delete(  @ApiParam("项目经历的pid")@RequestParam("pid")Integer pid
                            , @ApiParam("技术点的keyWord") @RequestParam("keyWord")String keyWord){
        return  technologyService.delete(pid,keyWord);
    }



}
