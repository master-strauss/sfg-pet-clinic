package guru.springframework.sfgpetclinic.model;

/* cucul created on 29/09/2021 inside the package - guru.springframework.sfgpetclinic.model */

public class Person extends BaseEntity {
    
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
