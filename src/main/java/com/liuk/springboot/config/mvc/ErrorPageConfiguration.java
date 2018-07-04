package com.liuk.springboot.config.mvc;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author kl
 */
@Configuration
public class ErrorPageConfiguration {

    /**
     *自定义错误请求页面
     * @return
     */
    @Bean
    public ErrorPageRegistrar errorPageRegistrar(){
        return registry -> {
            ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND,"/error/404");
            ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/500");
            registry.addErrorPages(errorPage404);
            registry.addErrorPages(errorPage500);
        };
    }
}
