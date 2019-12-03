package com.codeinvestigator.servicecontrollerrestcontrollerbean.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class TractorbeamService {
    private final NavigationComputer navigationComputer;

    public void tractorBeamSomethingHome(String something){
        String tractorbeamstr = String.format("wooopity woop beaming %s by using path %s",
                something, navigationComputer.navigate());
        System.out.println(tractorbeamstr);
    }

    @PostConstruct
    public void done(){
        tractorBeamSomethingHome("Furry alien");
    }

}
