package com.tianyue.ws.service;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bwang7 on 10/4/16.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class PassengerPostServiceBean implements PassengerPostService{
    @Autowired
    private PassengerRepository passengerRepository;

    @CachePut(value = "passengers",key = "#passenger.id")
    public Passenger create(Passenger passenger) {

        Passenger savedPassenger = passengerRepository.save(passenger);
        return savedPassenger;
    }
}
