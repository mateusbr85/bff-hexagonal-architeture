package bff.authentication.authentication.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bff.authentication.authentication.adapters.outputs.FindAdrresByZipCodeAdapter;
import bff.authentication.authentication.adapters.outputs.UpdateCustomerAdapter;
import bff.authentication.authentication.application.core.usecase.FindCustomerByIdUseCase;
import bff.authentication.authentication.application.core.usecase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerBean {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase (
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAdrresByZipCodeAdapter findAdrresByZipCodeAdapter,
        UpdateCustomerAdapter updateCustomerAdapter

    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAdrresByZipCodeAdapter, updateCustomerAdapter);
    }
}
