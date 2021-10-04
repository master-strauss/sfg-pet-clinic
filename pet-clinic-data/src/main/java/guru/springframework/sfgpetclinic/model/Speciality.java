package guru.springframework.sfgpetclinic.model;/* cucul created on 04/10/2021 inside the package - guru.springframework.sfgpetclinic.model */

public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}