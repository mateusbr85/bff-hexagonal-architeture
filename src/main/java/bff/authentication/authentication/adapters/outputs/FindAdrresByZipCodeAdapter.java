package bff.authentication.authentication.adapters.outputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bff.authentication.authentication.adapters.outputs.clients.AddressResponseMapper;
import bff.authentication.authentication.adapters.outputs.clients.FindAddressByZipCodeClient;
import bff.authentication.authentication.application.core.domain.Address;
import bff.authentication.authentication.application.ports.output.FindAddressByZipCodeOutputPort;


@Component
public class FindAdrresByZipCodeAdapter implements FindAddressByZipCodeOutputPort {


    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
    
}
