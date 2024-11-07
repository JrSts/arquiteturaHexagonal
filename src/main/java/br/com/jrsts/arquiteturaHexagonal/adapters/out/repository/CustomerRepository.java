package br.com.jrsts.arquiteturaHexagonal.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

	
}
