package bff.authentication.authentication.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bff.authentication.authentication.adapters.outputs.FindAdrresByZipCodeAdapter;
import bff.authentication.authentication.adapters.outputs.InsertCustomerAdapter;
import bff.authentication.authentication.application.core.usecase.InsertCostumerUseCase;

@Configuration
public class InsertCustomerBean {
    @Bean
    public InsertCostumerUseCase insertCostumerUseCase(
        FindAdrresByZipCodeAdapter findAdrresByZipCodeAdapter,
        InsertCustomerAdapter insertCustomerAdapter
    ) {
        return new InsertCostumerUseCase(findAdrresByZipCodeAdapter, insertCustomerAdapter);
    }
}
