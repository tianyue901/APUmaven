package com.tianyue.ws.service.passenger;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.model.Driver;
import com.tianyue.ws.model.Passenger;

import java.util.Collection;
import java.util.List;

/**
 * Created by bwang7 on 10/4/16.
 */
public interface PassengerGetService {
    Collection<Passenger> findAll();

    List<Passenger> findPassenger(Agent agent);

    List<Passenger> findPassenger(Agent agent, Driver driver);

}
