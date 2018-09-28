package com.elti.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by e.sh. on 27-Sep-18
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Recipe List!!! --- 134343");

        return "index";
    }
}
