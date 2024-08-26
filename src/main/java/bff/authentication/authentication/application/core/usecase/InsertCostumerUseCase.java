package bff.authentication.authentication.application.core.usecase;

import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.input.InsertCustomerInputPort;
import bff.authentication.authentication.application.ports.output.FindAddressByZipCodeOutputPort;
import bff.authentication.authentication.application.ports.output.InsertCustomerOutputPort;

public class InsertCostumerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCostumerUseCase(
        FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
        InsertCustomerOutputPort insertCustomerOutputPort
        ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
