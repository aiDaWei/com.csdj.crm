package com.csdj.crmproject.crmproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.csdj.crmproject.crmproject.dao")
public class CrmprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmprojectApplication.class, args);
    }
}
