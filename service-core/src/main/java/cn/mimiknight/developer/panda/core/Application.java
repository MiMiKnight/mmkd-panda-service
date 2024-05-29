package cn.mimiknight.developer.panda.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2024-05-29 23:12:48
 */
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 启动项目
        SpringApplication.run(Application.class, args);
        log.info("The project started successfully.");
    }

}
