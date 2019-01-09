package com.liuk.springboot.config.mybatis;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class MyMybatisPlugins implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
//        System.out.println("MyMybatisPlugins intercept:" + invocation);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
//        System.out.println("MyMybatisPlugins plugin:" + target);
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {
//        System.out.println("MyMybatisPlugins setProperties:" + properties);
    }
}
