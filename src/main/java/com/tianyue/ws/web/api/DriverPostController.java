package com.tianyue.ws.web.api;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.service.driver.DriverPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverPostController {

    @Autowired
    private DriverPostService driverPostService;

    @RequestMapping(
            value = "/api/drivers",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver){

        Driver savedDriver = driverPostService.create(driver);

        return new ResponseEntity<Driver>(savedDriver, HttpStatus.CREATED);
    }
}

