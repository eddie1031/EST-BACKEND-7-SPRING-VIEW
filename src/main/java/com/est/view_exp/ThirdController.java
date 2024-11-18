package com.est.view_exp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}
