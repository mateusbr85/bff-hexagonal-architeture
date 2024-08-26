package bff.authentication.authentication.application.ports.output;

import bff.authentication.authentication.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
