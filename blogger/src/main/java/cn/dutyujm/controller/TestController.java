package cn.dutyujm.controller;

import cn.dutyujm.config.AjaxResponse;
import cn.dutyujm.model.Test;
import cn.dutyujm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public AjaxResponse getTechnology(@RequestBody Test test){
        return AjaxResponse.success(testService.insert(test));
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public AjaxResponse getAll(){
        List<Test> testList = testService.getAll();
        return AjaxResponse.success(testList);
    }
    @RequestMapping(value = "/getPage",method = RequestMethod.GET)
    public AjaxResponse getPage(){
        return AjaxResponse.success(testService.getPage().getContent());
    }




}
