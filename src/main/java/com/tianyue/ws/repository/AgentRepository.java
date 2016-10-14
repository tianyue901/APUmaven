package com.tianyue.ws.repository;

import com.tianyue.ws.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pipposheng on 10/13/16.
 */
@Repository
public interface AgentRepository extends JpaRepository<Agent, String>{
}
