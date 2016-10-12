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
 * Created by pipposheng on 10/10/16.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class DriverPassengerLinkPostServiceBean implements DriverPassengerLinkPostService{

    @Autowired
    private DriverPassengerLinkRepository driverPassengerLinkRepository;

    @CachePut(value = "driverPassengerLinks",key = "#link.id")
    public DriverPassengerLink create (Driver driver, Passenger passenger) {
        DriverPassengerLink driverPassengerLink = new DriverPassengerLink(driver.getPeopleId(),passenger.getPeopleId());
        DriverPassengerLink savedDriverPassengerLink = driverPassengerLinkRepository.save(driverPassengerLink);
        return savedDriverPassengerLink;
    }

}
