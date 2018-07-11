package com.liuk.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liuk.springboot.mapper")
public class SpringbootMybatisShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisShiroApplication.class, args);
	}
}
