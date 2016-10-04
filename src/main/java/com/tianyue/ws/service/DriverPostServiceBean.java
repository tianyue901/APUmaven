package com.tianyue.ws.service;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class DriverPostServiceBean implements DriverPostService {

    @Autowired
    private DriverRepository driverRepository;

    @CachePut(value = "drivers",key = "#driver.id")
    public Driver create(Driver driver) {

        Driver savedDriver = driverRepository.save(driver);
        return savedDriver;
    }

}
