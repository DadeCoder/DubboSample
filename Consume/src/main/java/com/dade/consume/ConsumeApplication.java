package com.dade.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan                                                //组件扫描
@Configuration                                                //配置控制
@EnableAutoConfiguration                                    //启用自动配置
@ImportResource({"classpath:dubbo-consumer.xml"}) 			//加入spring的bean的xml文件
@SpringBootApplication
public class ConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}
}
