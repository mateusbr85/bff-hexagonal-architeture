package bff.authentication.authentication.adapters.inputs.consumers.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String zipCode;
    private String Cpf;
    private Boolean isValidCpf;
}
