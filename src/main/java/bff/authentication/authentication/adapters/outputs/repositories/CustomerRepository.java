package bff.authentication.authentication.adapters.outputs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import bff.authentication.authentication.adapters.outputs.repositories.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
    
}
