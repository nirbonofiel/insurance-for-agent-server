package agentinsurancesystem.controllers;

import agentinsurancesystem.ResponseHandler;
import agentinsurancesystem.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
public class AgentController {
    @Autowired
    private AgentService agentService;
    @GetMapping("/agent")
    public ResponseHandler agent() {
        return new ResponseHandler(true,"",agentService.getAgents());
    }
}
