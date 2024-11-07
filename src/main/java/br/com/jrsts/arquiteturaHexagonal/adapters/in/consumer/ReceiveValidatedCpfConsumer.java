package br.com.jrsts.arquiteturaHexagonal.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.jrsts.arquiteturaHexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.jrsts.arquiteturaHexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.jrsts.arquiteturaHexagonal.application.ports.in.UpdateCustomerInputPort;

@Component
public class ReceiveValidatedCpfConsumer {
	
	@Autowired
	private UpdateCustomerInputPort updateCustomerInputPort;

	@Autowired
	private CustomerMessageMapper customerMessageMapper;

	@KafkaListener(topics = "tp-cpf-validated", groupId = "jrsts")
	void receive(CustomerMessage customerMessage) {
		var customer = customerMessageMapper.toCustomer(customerMessage);
		updateCustomerInputPort.update(customer, customerMessage.getZipCode());
	}
}
