package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.CustomerRepository;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerAdapter implements InsertCustomerOutputPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;
	
	@Override
	public void insert(Customer customer) {
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		customerRepository.save(customerEntity);
	}
}
