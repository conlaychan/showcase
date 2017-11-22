package com.logibeat.cloud.showcase.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShowcaseWebApplication {
    public static void main(String[] args) {
        // 设置日志实现框架
        // System.setProperty("org.springframework.boot.logging.LoggingSystem", "org.springframework.boot.logging.logback.LogbackLoggingSystem");
        SpringApplication.run(ShowcaseWebApplication.class, args);
    }
}
