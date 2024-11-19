package com.est.view_exp.service;

import com.est.view_exp.controller.FifthController;
import org.springframework.stereotype.Service;

@Service
public class SuperComplexService {

    // Super Duper Complex Logic
    public int sum(FifthController.Numbers numbers) {
        return numbers.getA() + numbers.getB();
    }

}
