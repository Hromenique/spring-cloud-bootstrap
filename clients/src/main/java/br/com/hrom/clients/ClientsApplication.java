package br.com.hrom.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientsApplication.class, args);
	}
}
