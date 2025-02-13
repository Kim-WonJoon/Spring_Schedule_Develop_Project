package com.example.schedule_developLv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ScheduleDevelopLv1Application {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleDevelopLv1Application.class, args);
    }

}
