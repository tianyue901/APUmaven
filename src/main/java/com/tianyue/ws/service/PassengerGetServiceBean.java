package com.tianyue.ws.service;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by bwang7 on 10/4/16.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PassengerGetServiceBean implements PassengerGetService{
    @Autowired
    private PassengerRepository passengerRepository;

    public Collection<Passenger> findAll() {
        Collection<Passenger> passengers = passengerRepository.findAll();
        return passengers;
    }
}
