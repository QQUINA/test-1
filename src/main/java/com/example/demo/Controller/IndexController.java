package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by XDFH on 2017/6/20.
 */

@RequestMapping
@Controller
public class IndexController {


    @GetMapping
    public String toHome(){

        return "home";

    }
}
