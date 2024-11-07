package br.com.jrsts.arquiteturaHexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.InsertCustomerAdapter;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.SendCpfForValidationAdapter;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class InserCustomerConfig {

	@Bean
	InsertCustomerUseCase insertCustomerUseCase(
			FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
			InsertCustomerAdapter insertCustomerAdapter,
			SendCpfForValidationAdapter sendCpfForValidationAdapter
	) {
		return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
	}
}
