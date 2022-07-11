package blaash.gaming.mobile.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class InitiateHttpPost {
    private final Object body;
    private final OnHttpPostComplete context;
    private final String url;

    protected InitiateHttpPost(Object body, OnHttpPostComplete context,String url) {
        this.body = body;
        this.context = context;
        this.url = url;
    }

    void initiatePostRequest()
    {
        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        Gson gson = builder.setPrettyPrinting().create();
        String jsonBody = gson.toJson(this.body);
        PostHttpRequest post = new PostHttpRequest(this.context);
        post.execute(url,jsonBody);
    }
}
