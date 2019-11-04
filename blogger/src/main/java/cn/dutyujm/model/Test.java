package cn.dutyujm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity  //声明实体类
@Table(name = "test")//声明实体类和表的映射关系
public class Test {
    public Test(){
    }

    @Id //声明主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //IDENTITY是自动增长
    @Column(name="id") //配置属性和字段的映射关系
    private Integer id;

    @Column(name="username")
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="birthday")
    private Date birthday;
}
