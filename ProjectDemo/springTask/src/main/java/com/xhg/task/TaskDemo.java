package com.xhg.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by xhg
 */
@SpringBootApplication
@EnableScheduling
public class TaskDemo {
    public static void main(String[] args) {
        SpringApplication.run(TaskDemo.class);
    }
}
