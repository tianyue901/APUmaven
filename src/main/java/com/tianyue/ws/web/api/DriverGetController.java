package com.tianyue.ws.web.api;


import com.tianyue.ws.model.Driver;
import com.tianyue.ws.service.DriverGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DriverGetController {

    @Autowired
    private DriverGetService driverGetService;

    @RequestMapping(
            value = "/api/drivers",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Driver>> getDrivers(){

        Collection<Driver> drivers = driverGetService.findAll();

        return new ResponseEntity<Collection<Driver>>(drivers, HttpStatus.OK);
    }
}
