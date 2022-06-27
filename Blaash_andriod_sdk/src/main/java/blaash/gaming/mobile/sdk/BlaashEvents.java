package blaash.gaming.mobile.sdk;

import java.util.List;

public class BlaashEvents {
    private final String Portal_CustomerId;
    private final String emailId;
    private final String primaryPhoneNumber;
    private final String first_name;
    private final String facebookId;
    private  boolean isAnonymousUser = true;
    private final String last_name;
    private List<Event_information> event_info;

    public void setEventInfo(List<Event_information> event_info) {
        this.event_info = event_info;
    }

    protected BlaashEvents(String portal_CustomerId, String emailId,String facebookId,
                        String primaryPhoneNumber, String first_name,
                        String last_name) {
        Portal_CustomerId = portal_CustomerId;
        this.emailId = emailId;
        this.facebookId = facebookId;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.first_name = first_name;
        this.last_name = last_name;

        SetAnonymousUser();
    }

    private void SetAnonymousUser()
    {
       if(IsNullOREmpty(emailId) || IsNullOREmpty(primaryPhoneNumber) || IsNullOREmpty(facebookId))
           isAnonymousUser = false;
    }

    private  boolean IsNullOREmpty(String value)
    {
        return value != null && value.length() > 0;
    }
}
