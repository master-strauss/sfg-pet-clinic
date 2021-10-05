package guru.springframework.sfgpetclinic.repositories;

/* cucul created on 05/10/2021 inside the package - guru.springframework.sfgpetclinic.repositories */

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
