package com.sweatpear.onlinebank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @author alaner28
 * &#64;data 2026/3/26 17:46
 */
public class OnlineBankApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineBankApplication.class, args);
    }
}
