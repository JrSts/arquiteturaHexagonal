package br.com.jrsts.arquiteturaHexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.DeleteCostumerByIdAdapter;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.jrsts.arquiteturaHexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerConfig {

	@Bean
	DeleteCustomerByIdUseCase deleteCustomerByIdUseCase (
			FindCustomerByIdUseCase findCustomerByIdUseCase,
			DeleteCostumerByIdAdapter deleteCostumerByIdAdapter
	) {
		return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCostumerByIdAdapter);
	}
}
