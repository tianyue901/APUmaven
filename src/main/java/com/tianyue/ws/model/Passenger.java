package com.tianyue.ws.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

/**
 * Created by bwang7 on 10/4/16.
 */
@Entity
@PrimaryKeyJoinColumn(name="people_id")
public class Passenger extends People{
    private int numberLuggage;
    private String flightNumber;
    private Date arrivingDate;

    public int getNumberLuggage() {
        return numberLuggage;
    }

    public void setNumberLuggage(int numberLuggage) {
        this.numberLuggage = numberLuggage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getArrivingDate() {
        return arrivingDate;
    }

    public void setArrivingDate(Date arrivingDate) {
        this.arrivingDate = arrivingDate;
    }
}
