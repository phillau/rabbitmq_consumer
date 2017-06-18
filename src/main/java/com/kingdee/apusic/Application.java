package com.kingdee.apusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan
@ImportResource({ "classpath:applicationContext.xml" })  
public class Application {
	private static volatile boolean running = true;
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        synchronized (Application.class) {
			while (running) {
				try {
					Application.class.wait();
				} catch (Throwable e) {
				}
			}
		}
    }

}