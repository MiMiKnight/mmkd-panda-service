package cn.mimiknight.developer.panda.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.Instant;

/**
 * 启动类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2024-05-29 23:12:48
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"cn.mimiknight.developer.panda"})
public class Application {
    public static void main(String[] args) {
        // 启动项目
        cost(() -> SpringApplication.run(Application.class, args));
    }

    private static void cost(Runnable function) {
        Instant start = Instant.now();
        function.run();
        Instant end = Instant.now();
        Duration cost = Duration.between(start, end);
        log.info("The project started successfully,cost = {}ms", cost.toMillis());
    }

}
