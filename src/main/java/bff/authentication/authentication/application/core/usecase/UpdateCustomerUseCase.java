package bff.authentication.authentication.application.core.usecase;

import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.input.FindCustomerByIdInputPot;
import bff.authentication.authentication.application.ports.input.UpdateCustomerInputPort;
import bff.authentication.authentication.application.ports.output.FindAddressByZipCodeOutputPort;
import bff.authentication.authentication.application.ports.output.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {
    

    private final FindCustomerByIdInputPot findCustomerByIdInputPot;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase (
        FindCustomerByIdInputPot findCustomerByIdInputPot, 
        FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
        UpdateCustomerOutputPort updateCustomerOutputPort
        ) {
        this.findCustomerByIdInputPot = findCustomerByIdInputPot;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update( Customer customer, String ZipCode) {
        findCustomerByIdInputPot.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(ZipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
