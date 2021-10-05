package guru.springframework.sfgpetclinic.repositories;

/* cucul created on 05/10/2021 inside the package - guru.springframework.sfgpetclinic.repositories */

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
