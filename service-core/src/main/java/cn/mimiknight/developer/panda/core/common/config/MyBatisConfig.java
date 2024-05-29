package cn.mimiknight.developer.panda.core.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-18 22:39:13
 */
@Configuration
@MapperScan(basePackages = {"cn.mimiknight.developer.panda.core.repository.mapper"})
public class MyBatisConfig {
}
