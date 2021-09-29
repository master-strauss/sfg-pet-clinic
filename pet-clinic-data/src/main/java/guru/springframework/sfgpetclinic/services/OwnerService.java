package guru.springframework.sfgpetclinic.services;/* cucul created on 30/09/2021 inside the package - guru.springframework.sfgpetclinic.services */

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
