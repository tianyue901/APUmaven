package com.tianyue.ws.service.driver;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.repository.DriverRepository;
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
public class DriverPostServiceBean {
    @Autowired
    private DriverRepository driverRepository;

    @CachePut(value = "drivers", key = "#driver.id")
    public Driver create(Driver driver){
        Driver savedDriver = driverRepository.save(driver);
        return savedDriver;
    }
}
