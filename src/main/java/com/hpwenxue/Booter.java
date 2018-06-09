package com.hpwenxue;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class Booter {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Booter.class);
		app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                
            }
        });
		app.run(args);
		//SpringApplication.run(Booter.class, args);
	}
}
