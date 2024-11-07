package br.com.jrsts.arquiteturaHexagonal.application.ports.out;

import java.util.Optional;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {

	Optional<Customer> find(String id);
	
}
