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
                        @NonNull String facebookId,boolean isAnonymous,String store_domain) {
        this.created_on_timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        this.clientId = BuildConfig.CLIENT_ID;
        this.portal_CustomerId = portalCustomerId;
        this.emailId = emailId;
        this.facebookId = facebookId;
        this.isAnonymous = isAnonymous;
        this.store_domain = store_domain;
    }
}
