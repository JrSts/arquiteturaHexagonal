package br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerEntity {

	@Id
	private String id;
	private String name;
	private String cpf;
	private AddressEntity address;
	private Boolean isValidCpf;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	public Boolean getIsValidCpf() {
		return isValidCpf;
	}
	public void setIsValidCpf(Boolean isValidCpf) {
		this.isValidCpf = isValidCpf;
	}
	
	
	
}
