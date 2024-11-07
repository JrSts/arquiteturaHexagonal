package br.com.jrsts.arquiteturaHexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ArquiteturaHezagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiteturaHezagonalApplication.class, args);
	}

}
