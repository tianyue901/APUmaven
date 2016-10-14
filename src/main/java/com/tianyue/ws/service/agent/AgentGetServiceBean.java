package com.tianyue.ws.service.agent;

import com.tianyue.ws.model.Agent;
import com.tianyue.ws.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by pipposheng on 10/13/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AgentGetServiceBean {

    @Autowired
    private AgentRepository agentRepository;

    public Collection<Agent> findAll(){

        Collection<Agent> Agents = agentRepository.findAll();
        return Agents;
    }
}
