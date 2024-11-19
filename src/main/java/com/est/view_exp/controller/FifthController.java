package com.est.view_exp.controller;

import com.est.view_exp.service.SuperComplexService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class FifthController {

    private final SuperComplexService service;

    @ResponseBody
    @GetMapping("/sum")
    public String showResult(Numbers numbers) {

        int result = service.sum(numbers);

        System.out.println("result = " + result);

        return "";
    }

    @Data
    public class Numbers {
        private int a;
        private int b;
    }

}
