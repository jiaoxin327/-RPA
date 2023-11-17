package com.zhuisuyun.net.rpaparent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lx
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.zhuisuyun.net.rpaparent.dao"})
public class RpaParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpaParentApplication.class, args);
    }

}
