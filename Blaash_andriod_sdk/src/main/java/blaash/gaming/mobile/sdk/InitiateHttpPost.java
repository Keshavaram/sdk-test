package blaash.gaming.mobile.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class InitiateHttpPost {
    private final Object body;
    private final Dispatch context;

    protected InitiateHttpPost(Object body, Dispatch context) {
        this.body = body;
        this.context = context;
    }

    void initiatePostRequest()
    {
        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        Gson gson = builder.setPrettyPrinting().create();
        String jsonBody = gson.toJson(this.body);
        PostHttpRequest post = new PostHttpRequest(this.context);
        post.execute(Constants.URL,jsonBody);
    }
}
