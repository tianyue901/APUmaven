package com.tianyue.ws.web.api;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.service.DriverGetService;
import com.tianyue.ws.service.DriverPostService;
import com.tianyue.ws.service.DriverPutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DriverPutController {

    @Autowired
    private DriverPutService driverPutService;

    @RequestMapping(
            value = "/api/drivers/",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver){

        Driver updatedDriver = driverPutService.update(driver);
        if (updatedDriver == null) {
            return new ResponseEntity<Driver>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Driver>(updatedDriver, HttpStatus.OK);
    }
}

