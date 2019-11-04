package cn.dutyujm.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("关于我Aboutme")
public class Aboutme  {
    @ApiModelProperty("姓名")
    private String name;

    private String position;

    private String state;

    private String selfevaluation;

    private String email;

    private String qq;

    private String wx;

    private String phone;


}