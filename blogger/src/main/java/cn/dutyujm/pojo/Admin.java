package cn.dutyujm.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value="admin")
public class Admin {
    @TableId( value="id")
    private Integer id;

    private String username;

    private String password;


}