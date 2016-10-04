package com.tianyue.ws.service;

import com.tianyue.ws.model.Driver;

import java.util.Collection;


public interface DriverGetService {

    Collection<Driver> findAll();

    Driver findOne(String id);

    Driver create(Driver driver);

    Driver update(Driver driver);

    void delete(String id);
}
