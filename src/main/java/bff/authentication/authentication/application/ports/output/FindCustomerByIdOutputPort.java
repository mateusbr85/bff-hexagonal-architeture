package bff.authentication.authentication.application.ports.output;

import java.util.Optional;

import bff.authentication.authentication.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find( String id );
}
