package com.tianyue.ws.service;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.model.Passenger;

/**
 * Created by pipposheng on 10/10/16.
 */
public interface DriverPassengerLinkPostService {
    DriverPassengerLink create(Driver driver, Passenger passenger);
}
