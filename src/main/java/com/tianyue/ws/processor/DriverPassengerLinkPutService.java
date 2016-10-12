package com.tianyue.ws.processor;

import com.tianyue.ws.model.Driver;
import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.model.Passenger;

/**
 * Created by pipposheng on 10/10/16.
 */
public interface DriverPassengerLinkPutService {
    DriverPassengerLink update(Driver driver, Passenger passenger);
}
