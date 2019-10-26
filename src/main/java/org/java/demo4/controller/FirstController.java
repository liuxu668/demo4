package org.java.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FirstController {

    @RequestMapping("/first")
    public String first(Model model){
        model.addAttribute("name","liuxu");
        return "index";
    }

}
