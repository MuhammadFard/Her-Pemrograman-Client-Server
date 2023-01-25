package com.farid.nasabahservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NasabahserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasabahserviceApplication.class, args);
	}
        @Bean
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }
}
