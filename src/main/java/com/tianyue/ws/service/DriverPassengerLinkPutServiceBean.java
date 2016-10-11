package com.tianyue.ws.service;

import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.repository.DriverPassengerLinkRepository;
import com.tianyue.ws.repository.DriverRepository;
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
public class DriverPassengerLinkPutServiceBean implements DriverPassengerLinkPutService {

    @Autowired
    private DriverPassengerLinkRepository driverPassengerLinkRepository;

    @CachePut(value = "driverPassengerLinks",key = "#link.id")
    public DriverPassengerLink update(DriverPassengerLink driverPassengerLink) {

        DriverPassengerLink updatedDriverPassengerLink = driverPassengerLinkRepository.save(driverPassengerLink);
        return updatedDriverPassengerLink;
    }

}
