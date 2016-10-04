package com.tianyue.ws.service;

import com.tianyue.ws.model.Passenger;

import java.util.Collection;

/**
 * Created by bwang7 on 10/4/16.
 */
public interface PassengerGetService {
    Collection<Passenger> findAll();
}
