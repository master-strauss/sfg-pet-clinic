package guru.springframework.sfgpetclinic.controllers;/* cucul created on 01/10/2021 inside the package - guru.springframework.sfgpetclinic.controllers */

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetsService;

    public VetController(VetService vetsService) {
        this.vetsService = vetsService;
    }

    @RequestMapping({"/vets", "vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetsService.findAll());
        return "vets/index";
    }
}
