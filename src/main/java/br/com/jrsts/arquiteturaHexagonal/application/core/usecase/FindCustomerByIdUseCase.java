package br.com.jrsts.arquiteturaHexagonal.application.core.usecase;

import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort{
	
	private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
	
	public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
		this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
	}

	@Override
	public Customer find(String id) {
		return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Custommer not found"));
	}
	
}
