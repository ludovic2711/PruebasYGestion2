package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping({"/", "/index"})
    public String holaSpring(){
        return "index";
    }

}
