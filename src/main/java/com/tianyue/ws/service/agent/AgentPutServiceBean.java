package com.tianyue.ws.service.agent;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pipposheng on 10/13/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AgentPutServiceBean {
    @Autowired
    private AgentRepository agentRepository;

    public Agent update(Agent agent){
        Agent updatedAgent = agentRepository.save(agent);
        return updatedAgent;
    }
}


