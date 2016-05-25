package com;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

import com.controller.WebController;
import com.timer.TimeSchedule;



@EnableAutoConfiguration
@Configuration
public class ApplicationMain extends SpringBootServletInitializer {
	   
	   //Application类中被重写的configure方法就是使用嵌入式的Spring上下文注册应用的地方。
	   //在更为正式的场景之中，这个方法可能会用来注册Spring Java配置类，它会定义应用中所有controller和服务的bean。
	   @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		   Class[] clazzs = new Class[]{ApplicationMain.class,TimeSchedule.class,WebController.class};
	        return builder.sources(clazzs);
	    }
	   

	
	

}
