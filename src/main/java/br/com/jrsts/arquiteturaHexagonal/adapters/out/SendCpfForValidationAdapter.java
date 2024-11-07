package br.com.jrsts.arquiteturaHexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import br.com.jrsts.arquiteturaHexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Override
	public void send(String cpf) {
		kafkaTemplate.send("tp-cpf-validation", cpf);
	}
}
