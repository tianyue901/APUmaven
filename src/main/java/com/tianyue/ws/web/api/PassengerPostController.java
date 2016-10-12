package com.tianyue.ws.web.api;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.service.passenger.PassengerPostService;
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
public class PassengerPostController {
    @Autowired
    private PassengerPostService passengerPostService;

    @RequestMapping(
            value = "/api/passengers",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Passenger> createDriver(@RequestBody Passenger passenger){

        Passenger savedPassenger = passengerPostService.create(passenger);

        return new ResponseEntity<Passenger>(savedPassenger, HttpStatus.CREATED);
    }
}
