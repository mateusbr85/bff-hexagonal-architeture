package bff.authentication.authentication.adapters.outputs.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bff.authentication.authentication.adapters.outputs.clients.response.AddressResponse;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${arantes.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
