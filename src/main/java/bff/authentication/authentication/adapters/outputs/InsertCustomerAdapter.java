package bff.authentication.authentication.adapters.outputs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bff.authentication.authentication.adapters.outputs.repositories.CustomerRepository;
import bff.authentication.authentication.adapters.outputs.repositories.mapper.CustomerEntityMapper;
import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.output.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
    
}
