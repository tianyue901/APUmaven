package com.tianyue.ws.service.agent;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pipposheng on 10/13/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AgentPostServiceBean {
    @Autowired
    private AgentRepository agentRepository;

    @CachePut(value = "agents", key = "#agent.id")
    public Agent create(Agent agent){
        Agent savedAgent = agentRepository.save(agent);
        return savedAgent;
    }
}


