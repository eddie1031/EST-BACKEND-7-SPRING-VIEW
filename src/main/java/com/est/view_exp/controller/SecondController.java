package com.est.view_exp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/page-1")
    public String showPage1() {

        /*
          thymeleaf:
            suffix: .html
            prefix: classpath:/templates/
         */

        return "hello_page";
        // classpath:/templates/hello_page.html
    }

    @GetMapping("/page-2")
    public String showPage2() {
        return "custom_dir_page";
    }

    @GetMapping("/page-3")
    public String showPage3(Model model) {

        model.addAttribute("message", "EST");

//        return "other_ext_file"; // .txt
        return "other_ext_page"; // .txt
    }



}
