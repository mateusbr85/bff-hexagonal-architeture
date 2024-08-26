package bff.authentication.authentication.adapters.outputs.clients;

import org.mapstruct.Mapper;

import bff.authentication.authentication.adapters.outputs.clients.response.AddressResponse;
import bff.authentication.authentication.application.core.domain.Address;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
