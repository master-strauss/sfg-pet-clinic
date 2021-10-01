package guru.springframework.sfgpetclinic.controllers;

/* cucul created on 01/10/2021 inside the package 
- guru.springframework.sfgpetclinic.controllers */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(){
        return "owners/index";
    }
}
