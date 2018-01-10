package io.github.benkoff.sswaggerui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by Ben Novikov on 2018-01-10
 */
@Controller
public class HomeController {
    @RequestMapping({"", "/", "index"})
    public String home() {
        return "index";
    }
}
