package bff.authentication.authentication.application.core.usecase;

import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.input.FindCustomerByIdInputPot;
import bff.authentication.authentication.application.ports.output.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPot {
    
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find( String id ) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(
            () -> new RuntimeException(
                "Customer not Found"
            )
        );
    }
}
