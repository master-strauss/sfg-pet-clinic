package guru.springframework.sfgpetclinic.model;

/* cucul created on 29/09/2021 inside the package - guru.springframework.sfgpetclinic.model */

public class PetType extends BaseEntity {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
