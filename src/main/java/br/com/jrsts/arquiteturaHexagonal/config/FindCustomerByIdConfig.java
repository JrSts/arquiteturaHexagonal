package br.com.jrsts.arquiteturaHexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.FindCustomerByIdAdapter;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerByIdConfig {

	@Bean
	FindCustomerByIdUseCase findCustomerByIdUseCase (
			FindCustomerByIdAdapter findCustomerByIdAdapter
	) {
		return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
	}
}
