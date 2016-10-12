package com.tianyue.ws.processor;

import com.tianyue.ws.model.DriverPassengerLink;

import java.util.Collection;

/**
 * Created by pipposheng on 10/10/16.
 */
public interface DriverPassengerLinkGetService {
    Collection<DriverPassengerLink> findAll();
}
