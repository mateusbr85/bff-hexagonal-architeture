package bff.authentication.authentication.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bff.authentication.authentication.adapters.outputs.DeleteCustomerByIdAdapter;
import bff.authentication.authentication.application.core.usecase.DeleteCustomerByIdUseCase;
import bff.authentication.authentication.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdBean {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase (
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
