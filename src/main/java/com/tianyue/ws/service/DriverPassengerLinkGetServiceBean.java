package com.tianyue.ws.service;

import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.repository.DriverPassengerLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by pipposheng on 10/10/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DriverPassengerLinkGetServiceBean implements DriverPassengerLinkGetService {

    @Autowired
    private DriverPassengerLinkRepository driverPassengerLinkRepository;

    public Collection<DriverPassengerLink> findAll() {
        Collection<DriverPassengerLink> driverPassengerLinks = driverPassengerLinkRepository.findAll();
        return driverPassengerLinks;
    }
}
