package com.jokerkiki.demo.config;

import com.jokerkiki.demo.entity.Person;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * configuration注解表示通知spring这是一个配置类，类似于原来配置的xml
 */
@Configuration

/**
 * value 扫描指定包路径下的bean实例
 * excludeFilters 指定过滤
 * type 过滤类型 annnatation注解类型
 * class  过滤Controller注解，Service注解
 *
 */
@ComponentScan(value = "com.jokerkiki.demo")
@EnableTransactionManagement
public class DemoConfig {

    @Bean
    public DataSource dataSource() throws Exception{
        ComboPooledDataSource dataSource =   new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useSSL=true");
      return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception{
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public PlatformTransactionManager PlatformTransactionManager()throws Exception{
        return  new DataSourceTransactionManager(dataSource());
    }

}
