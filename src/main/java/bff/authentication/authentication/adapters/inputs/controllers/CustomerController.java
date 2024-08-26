package bff.authentication.authentication.adapters.inputs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bff.authentication.authentication.adapters.inputs.controllers.mapper.CustomerMapper;
import bff.authentication.authentication.adapters.inputs.controllers.request.CustomerRequest;
import bff.authentication.authentication.adapters.inputs.controllers.response.CustomerResponse;
import bff.authentication.authentication.application.core.domain.Customer;
import bff.authentication.authentication.application.ports.input.DeleteCustomerByIdInputPort;
import bff.authentication.authentication.application.ports.input.FindCustomerByIdInputPot;
import bff.authentication.authentication.application.ports.input.InsertCustomerInputPort;
import bff.authentication.authentication.application.ports.input.UpdateCustomerInputPort;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPot findCustomerByIdInputPot;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;


    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(
        @PathVariable final String id
    ) {
        var customer = findCustomerByIdInputPot.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update (
        @PathVariable final String id,
        @RequestBody CustomerRequest customerRequest
    ) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (
        @PathVariable final String id
    ) {
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
