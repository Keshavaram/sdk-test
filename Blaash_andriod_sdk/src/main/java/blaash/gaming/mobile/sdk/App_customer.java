package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public class App_customer {
    private final String created_on_timestamp;
    private final String portal_CustomerId;
    private final String emailId;
    private final String facebookId;
    private final String clientId;
    private final boolean isAnonymous;
    private final String store_domain;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected App_customer(@NonNull String portalCustomerId, @NonNull String emailId,
                        @NonNull String facebookId) {
        this.created_on_timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        this.clientId = BuildConfig.CLIENT_ID;
        store_domain = "";

        if (portalCustomerId.length() == 0 || emailId.length() == 0)
        {
            this.portal_CustomerId = created_on_timestamp;
            this.emailId = created_on_timestamp + "@dummyemail.com";
            this.facebookId = "";
            this.isAnonymous = true;
        } else
        {
            this.portal_CustomerId = portalCustomerId;
            this.emailId = emailId;
            this.facebookId = facebookId;
            this.isAnonymous = false;
        }
    }
}
