package com.tianyue.ws.service.agent;

import com.tianyue.ws.model.Agent;

import java.util.Collection;

/**
 * Created by pipposheng on 10/13/16.
 */
public interface AgentGetService {
    Collection<Agent> findAll();
}
