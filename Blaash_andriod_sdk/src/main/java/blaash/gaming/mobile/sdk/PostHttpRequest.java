package blaash.gaming.mobile.sdk;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PostHttpRequest extends AsyncTask<String,Void,String> {
    private final OnHttpPostComplete apiCallComplete;

    protected PostHttpRequest(OnHttpPostComplete apiCallComplete) {
        this.apiCallComplete = apiCallComplete;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        apiCallComplete.notify(s);
    }

    @Override
    protected String doInBackground(String... strings) {
        //TODO dynamically setting header (key-value)
        Request req = new Request.Builder()
                .url(strings[0])
                .addHeader("x-tenant-key",BuildConfig.CLIENT_ID)
                .addHeader("x-api-key",BuildConfig.API_KEY)
                .post(RequestBody.create(MediaType.parse("application.json;charset=utf-8"),strings[1]))
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        Call call = okHttpClient.newCall(req);
        Response response;
        try
        {
            response = call.execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
