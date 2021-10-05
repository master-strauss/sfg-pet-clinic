package guru.springframework.sfgpetclinic.model;

/* cucul created on 29/09/2021 inside the package - guru.springframework.sfgpetclinic.model */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
