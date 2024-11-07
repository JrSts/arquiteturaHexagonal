package br.com.jrsts.arquiteturaHexagonal.adapters.in.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.jrsts.arquiteturaHexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

	@Mapping(target = "address", ignore = true)
	Customer toCustomer(CustomerMessage customerMessage);
}
