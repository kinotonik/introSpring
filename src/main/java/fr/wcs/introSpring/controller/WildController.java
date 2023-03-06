package fr.wcs.introSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WildController {
    @GetMapping("/atelier")
    @ResponseBody
    public String springHello() {
        return "Introduction à Spring";
    }
}

