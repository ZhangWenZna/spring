package org.example.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
