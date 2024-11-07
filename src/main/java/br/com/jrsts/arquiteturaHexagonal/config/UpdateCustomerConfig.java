package br.com.jrsts.arquiteturaHexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.UpdateCustomerAdapter;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.FindCustomerByIdUseCase;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerConfig {

	@Bean
	UpdateCustomerUseCase updateCustomerUseCase (
			FindCustomerByIdUseCase findCustomerByIdUseCase,
			FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
			UpdateCustomerAdapter updateCustomerAdapter
	) {
		return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
	}
}
