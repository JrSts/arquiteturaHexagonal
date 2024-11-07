package br.com.jrsts.arquiteturaHexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.jrsts.arquiteturaHexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(
		name = "FindAddressByZipCodeClient",
		url = "${jrsts.client.address.url}"
)

public interface FindAddressByZipCodeClient {

	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable String zipCode);
}
