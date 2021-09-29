package guru.springframework.sfgpetclinic.services;/* cucul created on 30/09/2021 inside the package - guru.springframework.sfgpetclinic.services */

import java.util.Set;

public interface Vet {
    Vet findByLastName(String lastName);
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
