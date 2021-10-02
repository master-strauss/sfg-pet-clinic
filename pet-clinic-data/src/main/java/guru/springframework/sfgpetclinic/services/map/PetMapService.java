package guru.springframework.sfgpetclinic.services.map;

/* cucul created on 01/10/2021 inside the package 
- guru.springframework.sfgpetclinic.services.map */

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}