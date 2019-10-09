package cn.dutyujm.controller;

import cn.dutyujm.pojo.Difficulties;
import cn.dutyujm.pojo.Notes;
import cn.dutyujm.pojo.Projectexperience;
import cn.dutyujm.service.DifficultiesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Difficulties")

@Api(tags = "Difficulties-Controller", description = "难点")

public class DifficultiesController {

    @Autowired
    private DifficultiesService difficultiesService ;

    /**
     * 难点
     * @param pid
     * @return
     */
    @ApiOperation("获得 难点")
    @RequestMapping(value = "/getDifficulties",method = RequestMethod.GET)
    public List<Difficulties> getDifficulties(@ApiParam("对应经历的id") @RequestParam("pid")Integer pid){
        return difficultiesService.getDifficulties(pid);
    }

    @ApiOperation("获得 某个难点")
    @RequestMapping(value = "/getOneDifficulty",method = RequestMethod.POST)
    public Difficulties getOneDifficulty(@ApiParam("对应难点的did") @RequestParam("did")Integer did){
            return  difficultiesService.selectByPrimaryKey(did);
    }

    @ApiOperation("修改 难点")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Integer update(@RequestBody Difficulties Difficulties){
            return  difficultiesService.updateByPrimaryKey(Difficulties);
    }

    /**
     * 添加难点数组
     * @param difficultiesList
     * @return
     */
    @ApiOperation("添加 难点")
    @RequestMapping(value = "/insertDifficulties" ,method = RequestMethod.POST)
    public Integer insertDifficulty(@ApiParam("难点数组")@RequestBody  List<Difficulties> difficultiesList){
        for (int i = 0; i < difficultiesList.size(); i++){
            Difficulties df =  difficultiesList.get(i);
            difficultiesService.insert(df);
            }
            return 1;
    }


    /**
     * 删除难点
     * @param did
     * @return
     */
    @ApiOperation("删除 难点")
    @RequestMapping(value = "/deleteDifficulties" ,method = RequestMethod.POST)
    public Integer deleteDifficulties(@ApiParam("难点id")@RequestParam("did")Integer did ){

        return difficultiesService.deleteDifficulties(did);


    }




}
