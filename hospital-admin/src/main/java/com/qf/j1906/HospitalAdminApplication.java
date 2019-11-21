package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qf.j1906"})
@EnableFeignClients(basePackages = {"com.qf.j1906"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringCloudApplication
public class HospitalAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAdminApplication.class, args);
    }

}
