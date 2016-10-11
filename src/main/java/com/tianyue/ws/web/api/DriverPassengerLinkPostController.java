package com.tianyue.ws.web.api;

import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.service.DriverPassengerLinkPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pipposheng on 10/10/16.
 */
@RestController
public class DriverPassengerLinkPostController {

    @Autowired
    private DriverPassengerLinkPostService driverPassengerLinkPostService;

    @RequestMapping(
            value = "api/driverpassengerlinks",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<DriverPassengerLink> createDriverPassengerLink(@RequestBody DriverPassengerLink driverPassengerLink){
//        DriverPassengerLink savedDriverPassengerLink = driverPassengerLinkPostService.create(driverPassengerLink);
//        return new ResponseEntity<DriverPassengerLink>(savedDriverPassengerLink, HttpStatus.CREATED);
        return null;
    }
}

