package com.liuk.springboot.config.thymeleaf;

import com.liuk.springboot.common.thymeleaf.dialect.DictDialect;
import com.liuk.springboot.service.impl.DictServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ThymeleafConfiguration {

    @Bean
    @ConditionalOnMissingBean
//    @DependsOn({"dictService"})
    public DictDialect dictDialect(){
        return new DictDialect();
    }
}
