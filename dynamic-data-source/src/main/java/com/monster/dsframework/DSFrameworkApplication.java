package com.monster.dsframework;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.monster.dsframework.mapper")
public class DSFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DSFrameworkApplication.class, args);
    }
}
