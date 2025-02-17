package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.CustomerRepository;
import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;
import br.com.jrsts.arquiteturaHexagonal.application.ports.out.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;
	
	@Override
	public Optional<Customer> find(String id) {
		var customerEntity = customerRepository.findById(id);
		
		return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
	}
}
