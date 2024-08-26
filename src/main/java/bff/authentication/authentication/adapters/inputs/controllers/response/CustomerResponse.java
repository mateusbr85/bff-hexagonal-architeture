package bff.authentication.authentication.adapters.inputs.controllers.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerResponse {
    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private AddressResponse address;

    @NotBlank
    private Boolean isValidCpf;
}