package com.liuk.springboot.config.mybatis;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.liuk.springboot.mapper","com.liuk.springboot.sys.mapper"})
public class MyBatisConfiguration {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    @Bean
    public Interceptor myInterceptor(){

        return new MyMybatisPlugins();
    }
}
