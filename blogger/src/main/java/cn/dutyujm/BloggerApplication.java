package cn.dutyujm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("cn.dutyujm.mapper")
public class BloggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BloggerApplication.class,args);
    }
}
