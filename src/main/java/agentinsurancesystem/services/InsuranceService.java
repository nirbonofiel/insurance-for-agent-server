package agentinsurancesystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InsuranceService {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Map<String, Object>> getInsurances() {
        String query ="SELECT * FROM agent_insurance_system.insurance ";
        return jdbcTemplate.queryForList(query);
    }
}
