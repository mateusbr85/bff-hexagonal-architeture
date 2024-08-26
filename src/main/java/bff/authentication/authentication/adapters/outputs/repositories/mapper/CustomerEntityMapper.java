package bff.authentication.authentication.adapters.outputs.repositories.mapper;

import org.mapstruct.Mapper;

import bff.authentication.authentication.adapters.outputs.repositories.entity.CustomerEntity;
import bff.authentication.authentication.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer( CustomerEntity customerEntity);
}
