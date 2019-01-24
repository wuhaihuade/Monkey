package com.mkwhh.mkboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(scanBasePackages={"com.mkwhh.mkboot"})
@SpringBootApplication
@MapperScan("com.mkwhh.mkboot.dao")
public class MkbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkbootApplication.class, args);
	}

}

