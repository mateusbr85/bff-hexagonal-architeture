package bff.authentication.authentication.adapters.outputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bff.authentication.authentication.adapters.outputs.repositories.CustomerRepository;
import bff.authentication.authentication.application.ports.output.DeleteCustomerByIdOutputPort;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
    
}
