package cn.dutyujm.controller;

import cn.dutyujm.service.AboutmeService;
import cn.dutyujm.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/Admin")
@Api(tags = "Admin-Controller", description = "后台登录API ！！！！！！！！！！！！！！！不要看错了！！！！！！！！！！！！！！！！")

public class AdminController {
    @Autowired
    private AdminService adminService;


    @ApiOperation("管理员后台登录！！！！！！！！！！！！！！！不要看错了！！！！！！！！！！！！！！！！")
    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
    public boolean adminLogin(@ApiParam("用户名") @RequestParam(value = "username") String username,@ApiParam("密码") @RequestParam(value = "password") String password){
        return  adminService.login(username,password);

    }



}
