package com.k15t.pat.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @GetMapping
    public String registration() {
        return "registration";
    }

    // Extend the current resource to receive and store the data in memory.
    // Return a success information to the user including the entered information.
    // In case of the address split the information into a better format/structure
    // for better handling later on.
    @PostMapping
    public String save() {
        return "result";
    }
}
