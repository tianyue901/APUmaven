package com.tianyue.ws.service.driver;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.model.Driver;
import com.tianyue.ws.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DriverGetServiceBean implements DriverGetService {

    @Autowired
    private DriverRepository driverRepository;

    public Collection<Driver> findAll() {

        Collection<Driver> drivers = driverRepository.findAll();
        return drivers;
    }

    @Override
    public List<Driver> findByAgent(Agent agent) {

        List<Driver> drivers = findByAgent(agent);
        return drivers;
    }

    @Override
    public Driver findById(String id) {

        Driver driver = findById(id);
        return driver;
    }

}
