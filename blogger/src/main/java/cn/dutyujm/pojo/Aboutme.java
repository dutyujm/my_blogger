package cn.dutyujm.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("关于我Aboutme")
public class Aboutme {
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