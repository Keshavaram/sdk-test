package blaash.gaming.mobile.sdk;

import android.content.Context;

public class ProcessURL {
    private static final String TAG = "ProcessURL";
    private final String URL;

    public ProcessURL() {
        this.URL = "https://d3s1h21vy1aj1w.cloudfront.net?token=UByul6dYhgntfeKBHDfe6svWP0cJ6y6pGRVsXsIKcwh4buwQFd5meKbqKrKE0s99f5lGiNDulwsF4nT5219aWqjQH3SraT4DrMphfyGPOIYsbwoOqNYEyhE6JuOXLJLaznvua3sMuW5zUszIaPeL9ubccLkezJ5OjnDXlsauEUjf7zT5OU7dDIVANOR123u7gVCShzOPtOdhVFDE1rz6xUjB1oNfk885%2FEENNy0gyHqC84XUvMLGCgdxGxa82bYBHj0e6xfqWaP%2FfWESnEAX3QsGZ4HJ5YBdpGwYeKY%2Bt0GgzC6cNYNMi1FKSzRl6UCUc4HjgAsULzyQL4se4v4srJrcPjyoc3Avz%2Fzxy31LqCiPm%2BfQCetYOCoGanUfUa7wbndkjvsj24TgD6ziENTQ%3D%3D ";
    }

    public String returnUrl()
    {
        return this.URL;
    }

    public void postRequest(String postData, String url, Context context)
    {

    }
}
