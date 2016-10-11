package com.tianyue.ws.web.api;

import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.service.DriverPassengerLinkPutService;
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
public class DriverPassengerLinkPutController {

    @Autowired
    private DriverPassengerLinkPutService driverPassengerLinkPutService;

    @RequestMapping(
            value = "api/driverpassengerlinks/",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<DriverPassengerLink> updateDriverPassengerLink(@RequestBody DriverPassengerLink driverPassengerLink){
        DriverPassengerLink updatedDriverPassengerLink = driverPassengerLinkPutService.update(driverPassengerLink);
        if (updatedDriverPassengerLink == null) {
            return new ResponseEntity<DriverPassengerLink>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<DriverPassengerLink>(updatedDriverPassengerLink, HttpStatus.OK);
    }
}
