package com.tianyue.ws.service.driver;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pipposheng on 10/13/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class DriverPutServiceBean {
    @Autowired
    private DriverRepository driverRepository;

    public Driver update(Driver driver){
        Driver updatedDriver = driverRepository.save(driver);
        return updatedDriver;
    }
}
