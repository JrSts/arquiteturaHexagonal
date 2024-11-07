package br.com.jrsts.arquiteturaHexagonal.application.ports.in;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

	void update(Customer customer, String zipCode);
}
