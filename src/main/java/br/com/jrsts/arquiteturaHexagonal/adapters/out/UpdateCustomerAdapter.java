package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.CustomerRepository;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.UpdateCustomerOutputPort;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;
	
	@Override
	public void update(Customer customer) {
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		customerRepository.save(customerEntity);
	}
}
