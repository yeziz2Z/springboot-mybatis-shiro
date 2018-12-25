package com.liuk.springboot.config.mybatis;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfiguration {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public Interceptor myInterceptor(){

        return new MyMybatisPlugins();
    }
}
