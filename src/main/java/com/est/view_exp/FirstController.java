package com.est.view_exp;

import jakarta.servlet.http.HttpServletResponse;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class FirstController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public void receiveRequestFromBrowser() {
        System.out.println("Hello World!");
        System.out.println("요청을 받아서 이 메세지를 출력합니다!");
    }

    @GetMapping("/print-string-1")
    public void printString1(HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        writer.println("Hello World!");
        writer.println("여러분 힘내세요!");
    }

    @GetMapping("/print-string-2")
    public void printString2(HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.println("여러분 항상 응원합니다!");
    }

    @ResponseBody
    @GetMapping("/print-string-3")
    public String printString3() {
        return "안녕하세요! @ResponseBody는 너무 편리한 어노테이션이에요!";
    }

    @ResponseBody
    @GetMapping("/print-integer")
    public Integer printInteger() {
        return 1;
    }

    @ResponseBody
    @GetMapping("/print-boolean")
    public boolean printBoolean() {
        return true;
    }

    @ResponseBody
    @GetMapping("/print-data-structure")
    public String[] printDataStructure() {
        return new String[]{
                "Hello, ",
                "World!"
        };
    }

    @ResponseBody
    @GetMapping("/print-obj")
    public SomeType printObject() {
        return new SomeType();
    }

    @Getter
    class SomeType {
        private final String data = "데이터";
    }

    @ResponseBody
    @GetMapping("/print-string-html")
    public String printStringHtml() {
        return "<html>" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "</head>" +
                "<body>" +
                "<h1> 안녕하세요!! </h1>" +
                "</body>" +
                "</html>";
    }

}
