package com.example.demo;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigurationProperties
@RestController
@SpringBootApplication
public class DemoApplication {


    @NotNull
    @Value("${campaign.banner.cache-timeout}")
    private String foo;

    @GetMapping(value = "/a")
    private String sout() {
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
