package guru.springframework.sfgpetclinic.model;/* cucul created on 30/09/2021 inside the package - guru.springframework.sfgpetclinic.model */

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
