package bff.authentication.authentication.application.core.domain;

public class Customer {

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
    
    public Customer() {
        this.isValidCpf = false;
    }

    public Customer (String id, String name, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public Address getAddress() {
        return address;
    }
    public String getCpf() {
        return cpf;
    }
    public String getId() {
        return id;
    }
    public Boolean getIsValidCpf() {
        return isValidCpf;
    }
    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setIsValidCpf(Boolean isValidCpf) {
        this.isValidCpf = isValidCpf;
    }
    public void setName(String name) {
        this.name = name;
    }
}
