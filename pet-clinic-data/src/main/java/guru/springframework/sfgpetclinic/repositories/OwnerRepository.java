package guru.springframework.sfgpetclinic.repositories;

/* cucul created on 05/10/2021 inside the package - guru.springframework.sfgpetclinic.repositories */

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
