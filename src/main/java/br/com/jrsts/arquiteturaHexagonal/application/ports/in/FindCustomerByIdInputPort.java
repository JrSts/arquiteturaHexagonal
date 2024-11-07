package br.com.jrsts.arquiteturaHexagonal.application.ports.in;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
	
	Customer find(String id);

}
