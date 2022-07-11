package blaash.gaming.mobile.sdk;

public class TenantSettingsRequest {
    private final String PrimaryGroup;
    private final String SecondaryGroup;
    private final String KeyName;

    public TenantSettingsRequest(String PrimaryGroup, String SecondaryGroup, String keyName) {
        this.PrimaryGroup = PrimaryGroup;
        this.SecondaryGroup = SecondaryGroup;
        KeyName = keyName;
    }
}
