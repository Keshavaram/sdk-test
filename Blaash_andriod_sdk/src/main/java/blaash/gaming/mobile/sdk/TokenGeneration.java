package blaash.gaming.mobile.sdk;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Random;


public class TokenGeneration {
    private static final String TAG = "Events";
    private final App_customer token;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected TokenGeneration(App_customer token) {
        this.token = token;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getTokenToSend() throws UnsupportedEncodingException {
        Gson gson = new Gson();
        String plainToken = gson.toJson(token);
        Log.e(TAG, "getTokenToSend: Generated json = " + plainToken); //TODO remove logs

        String[] characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        Random random = new Random();
        int charLen = characters.length;
        StringBuilder alphaNumeric = new StringBuilder();
        for (int i = 0; i < 180; i++) {
            alphaNumeric.append(characters[random.nextInt(charLen)]);
        }
        Crypto crypto = new Crypto(BuildConfig.CLIENT_SECRET);
        String a = crypto.encryptAsBase64(plainToken.getBytes());
        Log.e(TAG, "getTokenToSend: Cipher = " + a);
        return alphaNumeric + BuildConfig.CLIENT_ID + a;
    }
}
