package com.est.view_exp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class FourthController {

    //
    // /boards/공지사항/posts/1

    // 경로 변수(Path Variable)
    // /path1/mango
    @ResponseBody
    @GetMapping("/path1/{name}")
    public String showPathVariable1(
            @PathVariable(name = "name") String name
    ) {

        System.out.println("/path1/" + name);
        System.out.println("name = " + name);

        return "";
    }

    @ResponseBody
    @GetMapping("/path1/test")
    public String showPathVariable2() {
        System.out.println("!/path1/test");
        return "";
    }


    @ResponseBody
    @GetMapping(value = {"/path2", "/path2/{name}"})
    public String showPathVariable3(
            @PathVariable(name = "name", required = false) String name
    ) {
        System.out.println("/path2");
        System.out.println("name = " + name);
        return "";
    }

    @ResponseBody
    @GetMapping("/path2/test")
    public String showPathVariable4() {
        System.out.println("!/path2/test");
        return "";
    }

    @ResponseBody
    @GetMapping(value = {"/path3", "/path3/{name}"})
    public String showPathVariable5(
            @PathVariable(name = "name") Optional<String> nameOptional
    ) {
        System.out.println("/path3/" + nameOptional.orElse(null));
        System.out.println("name = " + nameOptional.orElse(null));

        return "";
    }

    @ResponseBody
    @GetMapping("/path4/{name}")
    public String showPathVariable6(@PathVariable String name) {

        System.out.println("/path4/" + name);
        System.out.println("name = " + name);

        return "";
    }

    @ResponseBody
    @GetMapping("/path5/{name}/{otherName}")
    public String showPathVariable7(
            @PathVariable String name,
            @PathVariable String otherName
    ) {

        System.out.println("/path/" + name + "/" + otherName);

        System.out.println("name = " + name);
        System.out.println("otherName = " + otherName);

        return "";
    }

}
