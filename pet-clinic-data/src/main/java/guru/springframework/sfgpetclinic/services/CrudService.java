package guru.springframework.sfgpetclinic.services;/* cucul created on 01/10/2021 inside the package - guru.springframework.sfgpetclinic.services */

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
