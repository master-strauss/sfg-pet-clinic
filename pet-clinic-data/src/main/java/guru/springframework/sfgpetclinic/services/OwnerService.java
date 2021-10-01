package guru.springframework.sfgpetclinic.services;/* cucul created on 30/09/2021 inside the package - guru.springframework.sfgpetclinic.services */

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
