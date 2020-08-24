package agentinsurancesystem;

import org.springframework.http.converter.json.JsonbHttpMessageConverter;

import java.util.List;
import java.util.Map;

public class ResponseHandler {

    private boolean success;
    private String error;
    private List<Map<String, Object>> data;

    public ResponseHandler(boolean success, String error, List<Map<String, Object>> data) {
        this.success = success;
        this.error = error;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }



    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

}
