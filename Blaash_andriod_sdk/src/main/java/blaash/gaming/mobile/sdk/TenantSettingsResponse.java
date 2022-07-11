package blaash.gaming.mobile.sdk;

import org.json.JSONObject;

public class TenantSettingsResponse {
    private long code;
    private String message;
    private String transaction_id;
    private JSONObject data;

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public JSONObject getData() {
        return data;
    }
}
