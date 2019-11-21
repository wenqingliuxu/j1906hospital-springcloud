package com.qf.j1906;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = {"com.qf.j1906.mapper"})
public class HospitalDoctorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalDoctorApplication.class, args);
    }

}
