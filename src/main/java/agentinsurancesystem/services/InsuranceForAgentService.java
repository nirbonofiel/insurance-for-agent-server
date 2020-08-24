package agentinsurancesystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InsuranceForAgentService {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Map<String, Object>> getInsurancesForAgent() {
        String query ="SELECT a.full_name as 'agent_name', i.name as 'insurance_name', i.monthly_cost FROM agent_insurance_system.insurance_for_agent as ai\n" +
                "INNER JOIN agent_insurance_system.agent as a\n" +
                "ON ai.agent_id = a.id\n" +
                "INNER JOIN agent_insurance_system.insurance as i\n" +
                "ON ai.insurance_id = i.id";
        return jdbcTemplate.queryForList(query);
    }
}
