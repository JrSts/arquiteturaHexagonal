package br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

	CustomerEntity toCustomerEntity(Customer customer);
	
	Customer toCustomer(CustomerEntity customerEntity);
}
