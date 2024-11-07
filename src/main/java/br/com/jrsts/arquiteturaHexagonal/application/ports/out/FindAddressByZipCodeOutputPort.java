package br.com.jrsts.arquiteturaHexagonal.application.ports.out;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

	Address find(String zipCode);
}
