package com.ty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

//指定要扫描的mapper包

@MapperScan("com.ty.mapper")
@SpringBootApplication(scanBasePackages = "com.ty.*")
public class SpringBootTongyongApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTongyongApplication.class, args);
    }



}