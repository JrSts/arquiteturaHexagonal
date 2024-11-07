package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.CustomerRepository;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

@Component
public class DeleteCostumerByIdAdapter implements DeleteCustomerByIdOutputPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void delete(String id) {
		customerRepository.deleteById(id);
	}
}
