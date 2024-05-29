package cn.mimiknight.developer.panda.core.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * my batis config
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2024-05-30 07:44:52
 */
@Configuration
@MapperScan(basePackages = {"cn.mimiknight.developer.panda.core.repository.mapper"})
public class MyBatisConfig {
}
