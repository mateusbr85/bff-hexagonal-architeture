package bff.authentication.authentication.application.ports.input;

import bff.authentication.authentication.application.core.domain.Customer;

public interface FindCustomerByIdInputPot {
    Customer find(String id);
}
