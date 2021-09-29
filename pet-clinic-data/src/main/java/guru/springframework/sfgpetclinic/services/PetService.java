package guru.springframework.sfgpetclinic.services;/* cucul created on 30/09/2021 inside the package - guru.springframework.sfgpetclinic.services */

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
