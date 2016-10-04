package com.tianyue.ws.service;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DriverGetServiceBean implements DriverGetService {

    @Autowired
    private DriverRepository driverRepository;

    public Collection<Driver> findAll() {

        Collection<Driver> drivers = driverRepository.findAll();
        return drivers;
    }

    public Driver findOne(String id) {
        return null;
    }

    public Driver create(Driver driver) {
        return null;
    }

    public Driver update(Driver driver) {
        return null;
    }

    public void delete(String id) {

    }
}
