package br.com.jrsts.arquiteturaHexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {

	void send(String cpf);
}
