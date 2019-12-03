package com.codeinvestigator.servicecontrollerrestcontrollerbean.space.controller;

import com.codeinvestigator.servicecontrollerrestcontrollerbean.space.Mineral;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class MyWebController {

    @GetMapping("/greeting")
    public String greeting(){
        return "greeting";
    }

    @GetMapping("/mineral")
    @ResponseBody
    public Mineral mineral(){
        return new Mineral(0, "Gold woooow nice.");
    }
}
