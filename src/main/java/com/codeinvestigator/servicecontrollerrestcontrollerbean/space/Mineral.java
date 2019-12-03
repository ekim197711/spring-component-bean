package com.codeinvestigator.servicecontrollerrestcontrollerbean.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mineral {
    @Id
    private Integer id;
    private String mineralType;
}
