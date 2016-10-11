package com.tianyue.ws.service;

import com.tianyue.ws.Application;
import com.tianyue.ws.model.Driver;
import com.tianyue.ws.model.DriverPassengerLink;
import com.tianyue.ws.model.Passenger;
import com.tianyue.ws.repository.DriverPassengerLinkRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;
import java.util.UUID;

/**
 * Created by pipposheng on 10/10/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DriverPassengerLinkPostServiceBeanTest {

    private Driver driver;
    private Passenger passenger;

    @Autowired
    private DriverPassengerLinkPostService driverPassengerLinkPostService;


    @Before
    public void setUp(){
        driver = new Driver();
        passenger = new Passenger();
    }

    @Test
    public void testCreate() throws Exception {
        driver.setPeopleId(UUID.randomUUID());
        passenger.setPeopleId(UUID.randomUUID());
        DriverPassengerLink driverPassengerLink = driverPassengerLinkPostService.create(driver, passenger);

    }
}
