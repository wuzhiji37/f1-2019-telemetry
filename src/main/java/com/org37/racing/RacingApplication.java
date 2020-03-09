package com.org37.racing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.org37.racing")
public class RacingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RacingApplication.class, args);
    }

}
