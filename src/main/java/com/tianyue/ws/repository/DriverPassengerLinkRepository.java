package com.tianyue.ws.repository;

import com.tianyue.ws.model.DriverPassengerLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pipposheng on 10/10/16.
 */
@Repository
public interface DriverPassengerLinkRepository extends JpaRepository<DriverPassengerLink, String> {
}
