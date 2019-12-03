package com.codeinvestigator.servicecontrollerrestcontrollerbean.space.controller;

import com.codeinvestigator.servicecontrollerrestcontrollerbean.space.Mineral;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MineralRestController {
    @Qualifier("gold")
    private final Mineral gold;
    @Qualifier("diamond")
    private final Mineral diamond;

    @GetMapping("/gold")
    public Mineral gold(){
        return gold;
    }
    @GetMapping("/diamon")
    public Mineral diamond(){
        return diamond;
    }
}
