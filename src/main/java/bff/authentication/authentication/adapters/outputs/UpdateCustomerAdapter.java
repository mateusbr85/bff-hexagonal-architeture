package bff.authentication.authentication.adapters.outputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bff.authentication.authentication.adapters.outputs.repositories.CustomerRepository;
import bff.authentication.authentication.adapters.outputs.repositories.mapper.CustomerEntityMapper;
import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.output.UpdateCustomerOutputPort;


@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
    
}
