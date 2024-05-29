package cn.mimiknight.developer.panda.core.common.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * App config
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2024-05-30 07:45:13
 */
@EnableCaching // 开启缓存
@EnableTransactionManagement // 开启事务
@Configuration
public class AppConfig {
}
