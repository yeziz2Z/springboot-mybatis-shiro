package com.liuk.springboot;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * 代码生成配置
 * @author liuk
 */
public class GenerateCode {

    @Test
    public void test(){
        //mybatis-plus 代码生成
        AutoGenerator generator = new AutoGenerator();

        //全局配置
        GlobalConfig config = new GlobalConfig();
        config.setAuthor("liuk")
                .setActiveRecord(true)
                .setBaseColumnList(true)
                .setBaseResultMap(true)
                .setOutputDir("G:\\mp-generate-code")
                .setIdType(IdType.UUID);

        generator.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://47.98.100.126:3306/sb-mybatis-shiro");

        generator.setDataSource(dataSourceConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("sys_")
                .setInclude("sys_dict_type"
                        ,"sys_dict_value"
                        ,"sys_log"
                        ,"sys_office"
                        ,"sys_role"
                        ,"sys_role_datarule"
                        ,"sys_role_menu"
                        ,"sys_schedule"
                        ,"sys_user_friend"
                        ,"sys_user_role");
        generator.setStrategy(strategyConfig);


        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.liuk.springboot")
                .setController("controller")
                .setMapper("mapper")
                .setService("service")
                .setEntity("entity");
        generator.setPackageInfo(packageConfig);

        generator.execute();
    }
}
