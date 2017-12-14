package com.cliff.rmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Cliff
 */
@Controller
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
