package com.tianyue.ws.web.api;

import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.service.PassengerGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by bwang7 on 10/4/16.
 */
@RestController
public class PassengerGetController {
    @Autowired
    private PassengerGetService passengerGetService;

    @RequestMapping(
            value = "/api/passengers",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Passenger>> getPassengers(){

        Collection<Passenger> passengers = passengerGetService.findAll();

        return new ResponseEntity<Collection<Passenger>>(passengers, HttpStatus.OK);
    }
}
