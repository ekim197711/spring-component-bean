package com.codeinvestigator.servicecontrollerrestcontrollerbean.space;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MineralRepository extends CrudRepository<Mineral, Integer> {
}
