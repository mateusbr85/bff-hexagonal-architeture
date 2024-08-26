package bff.authentication.authentication.adapters.outputs;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bff.authentication.authentication.adapters.outputs.repositories.CustomerRepository;
import bff.authentication.authentication.adapters.outputs.repositories.mapper.CustomerEntityMapper;
import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.output.FindCustomerByIdOutputPort;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        var customerMapper = customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
        return customerMapper;
    }

}
