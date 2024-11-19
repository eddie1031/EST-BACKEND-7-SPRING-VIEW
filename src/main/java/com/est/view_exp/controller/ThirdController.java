package com.est.view_exp.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class ThirdController {

    // http://localhost:8080/params1?test=1&name=hello&test=2&age=15
    @ResponseBody
    @GetMapping("/params1")
    public String showPrams1(HttpServletRequest req) {

        System.out.println("/params1");
        String name = req.getParameter("name");
        System.out.println("name = " + name);

        Map<String, String[]> parameterMap = req.getParameterMap();

//        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + Arrays.toString(entry.getValue()));
//        }

        System.out.println("map");
        parameterMap.forEach((k,v) -> {
            System.out.println(k + " = " + Arrays.toString(v));
        });

        return "";
    }

    // localhost:8080/params2?name=...
    @ResponseBody
    @GetMapping("/params2")
    public String showParams2(@RequestParam(name = "name") String name) {

        System.out.println("/params2");
        System.out.println("name = " + name);

        return "";
    }

    @ResponseBody
    @GetMapping("/params3")
    public String showParams3(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "age", defaultValue = "1") int age
    ){

        System.out.println("/params3");
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        return "";
    }

    @ResponseBody
    @GetMapping("/params4")
    public String showParams4(@ModelAttribute SignInRequest req) {
        System.out.println("/params4");
        String username = req.getUsername();
        System.out.println("username = " + username);
        return "";
    }

    @Data
    class SignInRequest {
        private String username;
        private String password;
    }

    @ResponseBody
    @GetMapping("/params5")
    public String showParams5(SignInRequest req) {
        System.out.println("/params5");
        String username = req.getUsername();
        System.out.println("username = " + username);
        return "";
    }

    @ResponseBody
    @GetMapping("/params6")
    public String showParams6(
            @RequestParam(name = "favorite") String[] favorites
    ) {
        System.out.println("/params6");

        for (String favorite : favorites) {
            System.out.println("favorite = " + favorite);
        }

        return "";
    }


}
