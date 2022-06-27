package blaash.gaming.mobile.sdk;

import androidx.annotation.NonNull;

import com.google.gson.JsonObject;


public class Event_information {
    private String event_name;
    private JsonObject event_data;

    protected Event_information(String event_name, JsonObject event_data) {
        this.event_name = event_name;
        this.event_data = event_data;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public JsonObject getEvent_data() {
        return event_data;
    }

    public void setEvent_data(JsonObject event_data) {
        this.event_data = event_data;
    }

    @NonNull
    @Override
    public String toString() {
        return "\tEvent Name = " + this.event_name + ",\n " + "\tJson = " + this.event_data;
    }
}
