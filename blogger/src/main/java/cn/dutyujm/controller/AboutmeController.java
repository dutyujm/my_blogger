package cn.dutyujm.controller;


import cn.dutyujm.pojo.Aboutme;
import cn.dutyujm.service.AboutmeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/Aboutme")
@Api(tags = "Aboutme-Controller", description = "关于我的API")


public class AboutmeController {
    @Autowired
    private AboutmeService aboutmeService;

    /**
     * 个人信息获取
     * @return
     */

    @ApiOperation("获取 我的信息")
    @RequestMapping(value = "/me",method = RequestMethod.GET)
    public Aboutme me(){
        return aboutmeService.getMe();
    }

    @ApiOperation("修改 我的信息")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Integer me(@ApiParam("Aboutme类") @RequestBody Aboutme aboutme){
        return aboutmeService.update(aboutme);
    }


}
