package br.com.jrsts.arquiteturaHexagonal.application.ports.in;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

	void insert(Customer customer, String zipCode);
	
}
