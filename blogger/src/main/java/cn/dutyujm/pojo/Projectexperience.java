package cn.dutyujm.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Data
public class Projectexperience {
    private Integer pid;

    private String projectname;

    private String url;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    @Temporal(TemporalType.TIMESTAMP)
    private Date starttime;

    private String technology;

    private String synopsis;

    private String mywork;


}