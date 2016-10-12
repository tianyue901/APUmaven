package com.tianyue.ws.service.passenger;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bwang7 on 10/4/16.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class PassengerPutServiceBean implements PassengerPutService{
    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger update(Passenger passenger) {
        Passenger updatedPassenger = passengerRepository.save(passenger);
        return updatedPassenger;
    }
}
