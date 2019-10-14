package cn.dutyujm.controller;


import cn.dutyujm.pojo.Bannerpictures;
import cn.dutyujm.service.BannerpicturesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Bannerpictures")

@Api(tags = " Bannerpictures-Controller", description = "banner图片")
public class BannerpicturesController {
    @Autowired
    BannerpicturesService bannerpicturesService;

    @RequestMapping(value = "/getBannerpictures",method = RequestMethod.GET)
    public List<Bannerpictures> getBannerpictures(@ApiParam("需求图片数量（可不填,有默认值5）") @RequestParam(defaultValue = "5") Integer num){
            return  bannerpicturesService.getBannerpictures(num);

    }

}
