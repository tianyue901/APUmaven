package com.tianyue.ws.processor;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.repository.DriverPassengerLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pipposheng on 10/13/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class DriverPassengerLinkPutServiceBean {

    @Autowired
    private DriverPassengerLinkRepository driverPassengerLinkRepository;

    public DriverPassengerLink update (Driver driver, Passenger passenger){
        DriverPassengerLink driverPassengerLink = new DriverPassengerLink(driver.getPeopleId(),passenger.getPeopleId());
        DriverPassengerLink updatedDriverPassengerLink = driverPassengerLinkRepository.save(driverPassengerLink);
        return updatedDriverPassengerLink;
    }
}


