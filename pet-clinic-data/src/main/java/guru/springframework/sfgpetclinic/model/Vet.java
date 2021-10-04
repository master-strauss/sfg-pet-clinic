package guru.springframework.sfgpetclinic.model;

/* cucul created on 29/09/2021 inside the package - guru.springframework.sfgpetclinic.model */

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
