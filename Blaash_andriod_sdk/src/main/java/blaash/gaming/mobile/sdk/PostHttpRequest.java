package blaash.gaming.mobile.sdk;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

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
//        Log.e("TAG", "onPostExecute: Done with post req");
        apiCallComplete.notify(s);
    }

    @Override
    protected String doInBackground(String... params) {
        Log.e("PostHttpRequest", "doInBackground: JSON = " + params[1]);
        Request req = new Request.Builder()
                .url(params[0])
                .addHeader("x-tenant-key",BuildConfig.CLIENT_ID)
                .addHeader("x-api-key",BuildConfig.API_KEY)
                .post(RequestBody.create(MediaType.parse("application.json;charset=utf-8"),params[1]))
                .build();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);

        OkHttpClient okHttpClient = builder.build();
        Call call = okHttpClient.newCall(req);
        Response response;
        try
        {
            response = call.execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
