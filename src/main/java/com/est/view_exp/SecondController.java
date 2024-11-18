package com.est.view_exp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/page-1")
    public String showPage1() {
        return "hello_page";
    }

}
