package com.historymap.historymap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RequestMapping("/")
@Controller
public class MainController {

    @Value("${map.api.key}")
    String MAP_API_KEY;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("MAP_API_KEY", MAP_API_KEY);

        return "index";
    }   
}