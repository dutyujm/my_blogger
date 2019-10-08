package cn.dutyujm.config;


import org.omg.CORBA.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 配置bean实例
     * @return
     */
    @Bean
    public Docket docket( ){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.dutyujm.controller"))
                .build();
    }

    private ApiInfo apiInfo(){

        //作者信息
       Contact contact = new Contact("仙女", "http://wangshaoli.com", "123456@qq.com");

     return  new ApiInfo("仙女的博客的Api",
             "仙女的博客的Api",
             "1.0",
             "urn:tos",
             contact,
             "Apache 2.0",
             "http://www.apache.org/licenses/LICENSE-2.0",
             new ArrayList());

    }
}
