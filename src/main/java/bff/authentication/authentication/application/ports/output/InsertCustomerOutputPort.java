package bff.authentication.authentication.application.ports.output;

import bff.authentication.authentication.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
