package com.tianyue.ws.repository;

import com.tianyue.ws.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bwang7 on 10/4/16.
 */
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {
}
