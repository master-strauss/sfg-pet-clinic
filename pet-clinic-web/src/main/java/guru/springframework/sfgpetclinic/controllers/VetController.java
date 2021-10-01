package guru.springframework.sfgpetclinic.controllers;/* cucul created on 01/10/2021 inside the package - guru.springframework.sfgpetclinic.controllers */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"/vets", "vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
