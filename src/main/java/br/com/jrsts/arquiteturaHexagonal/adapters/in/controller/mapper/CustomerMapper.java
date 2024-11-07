package br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.mapper;

import org.mapstruct.Mapping;

import br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface CustomerMapper {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "address", ignore = true)
	@Mapping(target = "isValidCpf", ignore = true)
	Customer toCustomer(CustomerRequest customerRequest);
	
	CustomerResponse toCustomerResponse(Customer customer);
}
