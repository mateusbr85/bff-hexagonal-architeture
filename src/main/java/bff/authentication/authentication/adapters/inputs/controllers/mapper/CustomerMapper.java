package bff.authentication.authentication.adapters.inputs.controllers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import bff.authentication.authentication.adapters.inputs.controllers.request.CustomerRequest;
import bff.authentication.authentication.adapters.inputs.controllers.response.CustomerResponse;
import bff.authentication.authentication.application.core.domain.Customer;

@Mapper( componentModel = "spring")
public interface CustomerMapper {
    
    @Mapping( target = "id", ignore = true)
    @Mapping( target = "address", ignore = true)
    @Mapping( target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
