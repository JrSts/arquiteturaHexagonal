package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Address;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

	@Autowired
	private FindAddressByZipCodeClient findAddressByZipCodeClient;
	
	@Autowired
	private AddressResponseMapper addressResponseMapper;
	
	
	@Override
	public Address find(String zipCode) {
		var addressResponse = findAddressByZipCodeClient.find(zipCode);
		return addressResponseMapper.toAddress(addressResponse);
	}
}
