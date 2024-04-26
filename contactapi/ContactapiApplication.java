package com.contactApi.contactapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
public class ContactapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactapiApplication.class, args);
	}

}
