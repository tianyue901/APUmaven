package com.tianyue.ws.service.driver;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.model.Driver;

import java.util.Collection;
import java.util.List;


public interface DriverGetService {

    Collection<Driver> findAll();

    List<Driver> findByAgent(Agent agent);

    Driver findById(String id);

}
