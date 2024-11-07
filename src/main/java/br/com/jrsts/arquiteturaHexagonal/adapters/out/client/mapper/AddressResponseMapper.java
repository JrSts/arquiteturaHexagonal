package br.com.jrsts.arquiteturaHexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.client.response.AddressResponse;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
	
	Address toAddress(AddressResponse addressResponse);
	
}
