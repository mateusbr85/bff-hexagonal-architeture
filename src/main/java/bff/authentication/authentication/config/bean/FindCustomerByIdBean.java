package bff.authentication.authentication.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bff.authentication.authentication.adapters.outputs.FindCustomerByIdAdapter;
import bff.authentication.authentication.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerByIdBean {
    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase (
        FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
