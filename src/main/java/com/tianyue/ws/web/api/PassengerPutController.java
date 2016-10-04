package com.tianyue.ws.web.api;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.service.PassengerPutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bwang7 on 10/4/16.
 */
@RestController
public class PassengerPutController {
    @Autowired
    private PassengerPutService passengerPutService;

    @RequestMapping(
            value = "/api/passengers/",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger passenger){

        Passenger updatedPassenger = passengerPutService.update(passenger);
        if (updatedPassenger == null) {
            return new ResponseEntity<Passenger>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Passenger>(updatedPassenger, HttpStatus.OK);
    }
}
