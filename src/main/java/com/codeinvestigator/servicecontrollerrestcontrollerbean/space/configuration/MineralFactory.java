package com.codeinvestigator.servicecontrollerrestcontrollerbean.space.configuration;

import com.codeinvestigator.servicecontrollerrestcontrollerbean.space.Mineral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MineralFactory {

    @Bean(name = "gold")
    public Mineral gold(){
        return new Mineral(100, "Real gold");
    }

    @Bean(name="diamond")
    public Mineral diamond(){
        return new Mineral(200, "Diamond");
    }

}
