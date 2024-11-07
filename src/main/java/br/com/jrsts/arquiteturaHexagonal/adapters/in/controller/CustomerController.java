package br.com.jrsts.arquiteturaHexagonal.adapters.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.mapper.CustomerMapper;
import br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.jrsts.arquiteturaHexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.jrsts.arquiteturaHexagonal.application.core.domain.Customer;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private InsertCustomerInputPort insertCustomerInputPort;
	
	@Autowired
	private FindCustomerByIdInputPort findCustomerByIdInputPort;
	
	@Autowired
	private UpdateCustomerInputPort updateCustomerInputPort;
	
	@Autowired
	private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

	@PostMapping
	public ResponseEntity<Customer> insert(@Valid @RequestBody CustomerRequest customerRequest){
		var customer = customerMapper.toCustomer(customerRequest);
		
		insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
		return ResponseEntity.status(HttpStatus.CREATED).body(customer);
				
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
		var customer = findCustomerByIdInputPort.find(id);
		
		if(customer != null) {
			return ResponseEntity.notFound().build();
		}
		
		var customerResponse = customerMapper.toCustomerResponse(customer);
		
		return ResponseEntity.ok().body(customerResponse);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable String id, CustomerRequest customerRequest) {
		var customer = customerMapper.toCustomer(customerRequest);
		updateCustomerInputPort.update(customer, customerRequest.getZipCode());
		customer.setId(id);
		
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		deleteCustomerByIdInputPort.delete(id);
		return ResponseEntity.noContent().build();
	}
}
