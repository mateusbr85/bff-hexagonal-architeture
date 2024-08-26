package bff.authentication.authentication.application.core.usecase;


import bff.authentication.authentication.application.ports.input.DeleteCustomerByIdInputPort;
import bff.authentication.authentication.application.ports.input.FindCustomerByIdInputPot;
import bff.authentication.authentication.application.ports.output.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {


    private final FindCustomerByIdInputPot findCustomerByIdInputPot;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;


    public DeleteCustomerByIdUseCase(
        FindCustomerByIdInputPot findCustomerByIdInputPot,
        DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        this.findCustomerByIdInputPot = findCustomerByIdInputPot;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }


    @Override
    public void delete(String id) {
        findCustomerByIdInputPot.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
    
}
