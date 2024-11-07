package br.com.jrsts.arquiteturaHexagonal.application.ports.out;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

	void update(Customer customer);
}
