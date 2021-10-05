package guru.springframework.sfgpetclinic.repositories;

/* cucul created on 05/10/2021 inside the package - guru.springframework.sfgpetclinic.repositories */

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}