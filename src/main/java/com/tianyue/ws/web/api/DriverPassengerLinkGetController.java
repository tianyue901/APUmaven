package com.tianyue.ws.web.api;

import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.service.DriverPassengerLinkGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by pipposheng on 10/10/16.
 */
@RestController
public class DriverPassengerLinkGetController {

    @Autowired
    private DriverPassengerLinkGetService driverPassengerLinkGetService;

    @RequestMapping(
            value = "/api/driverpassengerlinks",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<DriverPassengerLink>> getDriverPassengerLinks(){
        Collection<DriverPassengerLink> driverPassengerLinks = driverPassengerLinkGetService.findAll();
        return new ResponseEntity<Collection<DriverPassengerLink>>(driverPassengerLinks, HttpStatus.OK);
    }
}
