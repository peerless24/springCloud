package com.fyf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RequestMapping("/base")
@Controller
public class BaseController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
