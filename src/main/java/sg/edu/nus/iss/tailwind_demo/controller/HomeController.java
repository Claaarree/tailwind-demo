package sg.edu.nus.iss.tailwind_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String HomePage() {
        return "index";
    }
    
}
